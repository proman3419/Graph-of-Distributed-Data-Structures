package goddslang.core.model;

import goddslang.core.function.FunctionCall;
import goddslang.core.function.impl.DefineLabel;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<FunctionCall> functionCalls = new ArrayList<>();
    private final HashMap<String, Integer> definedLabels = new HashMap<>();
    private HashMap<Integer, Pipe> inputPipes; // Pipes that this cell can read from
    private HashMap<Integer, Pipe> outputPipes; // Pipes that this cell can write to
    private CallStack callStack = new CallStack(this, 0);
    private java.util.Set<CellOption> cellOptions;
    private Bus bus;
    private CellState state = CellState.RUNNING;
    private int R0 = 0;
    private int R1 = 0;
    private int idleStepsCount = 0;

    public void step() {
        if (this.state == CellState.RUNNING) {
            if (idleStepsCount > 1) {  // bigger than 1 due to first idle step being reading the number of idle steps
                idleStepsCount--;
            } else {
                FunctionCall functionCall = this.callStack.getFunctionCall();
                if (functionCall == null) {
                    this.state = CellState.FINISHED;
                } else {
                    functionCall.call(this);
                }
            }
        }
    }

    public void addFunctionCall(FunctionCall functionCall) {
        functionCall.setOwner(this);
        functionCall.setId(this.functionCalls.size());
        this.functionCalls.add(functionCall);
        if (Objects.equals(functionCall.getFunction().getClass(), DefineLabel.class)) {
            String definedLabel = functionCall.getArguments().get(0).getValueAsId();
            this.definedLabels.put(definedLabel, this.functionCalls.size());
        }
    }

    public void add(int value) {
        this.R0 += value;
    }

    public void sub(int value) {
        this.R0 -= value;
    }

    public void mul(int value) {
        this.R0 *= value;
    }

    public int div(int value) {
        if (value == 0) {
            return 1;
        }
        this.R0 /= value;
        return 0;
    }

    public void mod(int value) {
        this.R0 %= value;
    }

    public void abs() {
        this.R0 = Math.abs(this.R0);
    }

    public void set(String registerId, int value) {
        if (registerId.equals("R0")) {
            this.R0 = value;
        } else if (registerId.equals("R1")) {
            this.R1 = value;
        }
    }

    public void comp(int value) {
        this.R0 = Integer.compare(value, this.R0);
    }

    public void swap() {
        int tmp = this.R0;
        this.R0 = this.R1;
        this.R1 = tmp;
    }

    public void copy() {
        this.R1 = this.R0;
    }

    private String getPrintHeader(String value, int flag) {
        String header = null;
        if (flag == 0) {
            header = "";
        } else if (flag == 1) {
            header = this.label + ": ";
        } else if (flag == 2 && (Objects.equals(value, "R0") || Objects.equals(value, "R1"))) {
            header = this.label + "->" + value + ": ";
        }
        return header;
    }

    public int print(String value, int flag) {
        int errorCode = 0;
        String header = getPrintHeader(value, flag);
        if (header == null) {
            errorCode = 1;
            header = "";
        }
        if (value.equals("R0")) {
            System.out.printf("%s%d", header, this.R0);
        } else if (value.equals("R1")) {
            System.out.printf("%s%d", header, this.R1);
        } else {
            System.out.printf("%s%s", header, value);
        }
        return errorCode;
    }

    public int printNL(String value, int flag) {
        int errorCode = 0;
        String header = getPrintHeader(value, flag);
        if (header == null) {
            errorCode = 1;
            header = "";
        }
        if (value.equals("R0")) {
            System.out.printf("%s%d\n", header, this.R0);
        } else if (value.equals("R1")) {
            System.out.printf("%s%d\n", header, this.R1);
        } else {
            System.out.printf("%s%s\n", header, value);
        }
        return errorCode;
    }

    public int printChar(String value, int flag) {
        int errorCode = 0;
        String header = getPrintHeader(value, flag);
        if (header == null) {
            errorCode = 1;
            header = "";
        }
        if (value.equals("R0")) {
            System.out.printf("%s%c", header, (char) this.R0);
        } else if (value.equals("R1")) {
            System.out.printf("%s%c", header, (char) this.R1);
        }
        return errorCode;
    }

    public int printNLChar(String value, int flag) {
        int errorCode = 0;
        String header = getPrintHeader(value, flag);
        if (header == null) {
            errorCode = 1;
            header = "";
        }
        if (value.equals("R0")) {
            System.out.printf("%s%c\n", header, (char) this.R0);
        } else if (value.equals("R1")) {
            System.out.printf("%s%c\n", header, (char) this.R1);
        }
        return errorCode;
    }

    public int writeCell(String label) {
        Pipe outPipe = getOutputPipeByLabel(label);
        if (outPipe == null) {
            return 1;
        }
        outPipe.add(this.R0);
        return 0;
    }

    public int readCell(String label) {
        Pipe inPipe = getInputPipeByLabel(label);
        if (inPipe == null) {
            return 1;
        }
        if (inPipe.peek() != null) {
            this.R0 = inPipe.pop();
        } else {
            // If there's no data in the pipe wait with read
            int currFunctionCallId = this.callStack.getCurrFunctionCallId() - 1;
            this.callStack.safePop();
            this.callStack.push(this, currFunctionCallId);
        }
        return 0;
    }

    public void readBus() {
        if (this.bus.peek() != null) {
            this.R0 = this.bus.pop();
        }
    }

    public int copyCell(String label) {
        Cell neighbor = getReadableNeighborByLabel(label);
        if (neighbor == null) {
            return 1;
        }
        this.R0 = neighbor.getR0();
        return 0;
    }

    public int printLabelName(String label) {
        Cell neighbor = getNeighborByLabel(label);
        if (neighbor == null) {
            return 1;
        }
        System.out.println(neighbor.getLabel());
        return 0;
    }

    public void pass(int value) {
        this.idleStepsCount = value;
    }

    public int jump(String extendedDefinedLabel, Cell owner) {
        String[] extendedDefinedLabelParts = extendedDefinedLabel.split("@");
        if (extendedDefinedLabelParts.length == 1) { // Local scope (owner's or this cell's)
            this.callStack.safePop(); // Don't return to the place from which the jump has been made
        } else { // Neighbor scope
            owner = getNeighborByLabel(extendedDefinedLabelParts[0]);
            if (owner == null) {
                return 1;
            }
        }
        Integer functionCallId;
        String definedLabel = extendedDefinedLabelParts[extendedDefinedLabelParts.length - 1];
        if (Objects.equals(definedLabel, "^")) { // Start
            functionCallId = 0;
        } else if (Objects.equals(definedLabel, "$")) { // End
            functionCallId = owner.getFunctionCallsCount() - 1;
        } else { // Specific function call
            functionCallId = owner.getFunctionCallIdForLabel(definedLabel);
            if (functionCallId == null) {
                return 2;
            }
        }
        this.callStack.push(owner, functionCallId);
        return 0;
    }

    public int IFEZ(String extendedDefinedLabel, Cell owner) {
        return this.R0 == 0 ? jump(extendedDefinedLabel, owner) : 0;
    }

    public int IFNZ(String extendedDefinedLabel, Cell owner) {
        return this.R0 != 0 ? jump(extendedDefinedLabel, owner) : 0;
    }

    public int IFLZ(String extendedDefinedLabel, Cell owner) {
        return this.R0 < 0 ? jump(extendedDefinedLabel, owner) : 0;
    }

    public int IFGZ(String extendedDefinedLabel, Cell owner) {
        return this.R0 > 0 ? jump(extendedDefinedLabel, owner) : 0;
    }

    @Nullable
    private Integer getFunctionCallIdForLabel(String definedLabel) {
        return this.definedLabels.get(definedLabel);
    }

    public FunctionCall getFunctionCall(int functionCallId) {
        return this.functionCalls.get(functionCallId);
    }

    // Returns a neighbor that this cell can read from
    @Nullable
    private Cell getReadableNeighborByLabel(String neighborLabel) {
        Pipe inputPipe = getInputPipeByLabel(neighborLabel);
        return inputPipe == null ? null : inputPipe.getFromCell();
    }

    // Returns a neighbor that this cell can write to
    @Nullable
    private Cell getWritableNeighborByLabel(String neighborLabel) {
        Pipe outputPipe = getOutputPipeByLabel(neighborLabel);
        return outputPipe == null ? null : outputPipe.getToCell();
    }

    // Returns a neighbor that this cell can read from or write to
    @Nullable
    private Cell getNeighborByLabel(String neighborLabel) {
        Cell neighbor = getReadableNeighborByLabel(neighborLabel);
        return neighbor != null ? neighbor : getWritableNeighborByLabel(neighborLabel);
    }

    @Nullable
    private Pipe getOutputPipeByLabel(String neighborLabel) {
        return this.outputPipes.values().stream()
                .filter(pipe -> pipe.getToCell().getLabel().equals(neighborLabel))
                .findFirst()
                .orElse(null);
    }

    @Nullable
    private Pipe getInputPipeByLabel(String neighborLabel) {
        return this.inputPipes.values().stream()
                .filter(pipe -> Objects.equals(pipe.getFromCell().getLabel(), neighborLabel))
                .findFirst()
                .orElse(null);
    }

    public boolean isRunning() {
        return this.state == CellState.RUNNING;
    }

    public void setInputPipes(HashMap<Integer, Pipe> inputPipes) {
        this.inputPipes = inputPipes;
    }

    public void setOutputPipes(HashMap<Integer, Pipe> outputPipes) {
        this.outputPipes = outputPipes;
    }

    public void setBusPipe(Bus bus) {
        this.bus = bus;
    }

    public Pipe getOutPipe(int toId) {
        return this.outputPipes.get(toId);
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCellOptions(Set<CellOption> cellOptions) {
        this.cellOptions = cellOptions;
    }

    public Set<CellOption> getCellOptions() {
        return cellOptions;
    }

    public int getR0() {
        return R0;
    }

    public int getR1() {
        return R1;
    }

    public int getFunctionCallsCount() {
        return this.functionCalls.size();
    }

    public void exit() {
        this.callStack.safePop();
        if (this.callStack.isEmpty()) {
            this.state = CellState.FINISHED;
        }
    }

    public void terminate() {
        this.callStack = null;
        this.state = CellState.FINISHED;
    }
}
