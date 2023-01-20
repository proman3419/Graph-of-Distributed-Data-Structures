package goddslang.core.model;

import goddslang.core.function.FunctionCall;
import goddslang.core.function.impl.DefineLabel;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<FunctionCall> functionCalls = new ArrayList<>();
    private final HashMap<String, Integer> definedLabels = new HashMap<>();
    private HashMap<Integer, Cell> neighbors;
    private HashMap<Integer, Pipe> inPipes;
    private HashMap<Integer, Pipe> outPipes;
    private CallStack callStack = new CallStack(this, 0);
    private CellState state = CellState.RUNNING;
    private int R0 = 0;
    private int R1 = 0;

    public void step() {
        if (this.state == CellState.RUNNING) {
            FunctionCall functionCall = this.callStack.getFunctionCall();
            if (functionCall == null) {
                this.state = CellState.FINISHED;
            } else {
                functionCall.call(this);
            }
        }
    }

    public void addFunctionCall(FunctionCall functionCall) {
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

    public void div(int value) {
        this.R0 /= value;
    }

    public void mod(int value) {
        this.R0 %= value;
    }

    public void set(int registerId, int value) {
        if (registerId == 0) {
            this.R0 = value;
        } else if (registerId == 1) {
            this.R1 = value;
        }
    }

    public void comp(int value) {
        if (value < this.R0) {
            this.R0 = -1;
        } else if (value > this.R0) {
            this.R0 = 1;
        } else {
            this.R0 = 0;
        }
    }

    public void swap() {
        int tmp = this.R0;
        this.R0 = this.R1;
        this.R1 = tmp;
    }

    public void copy() {
        this.R1 = this.R0;
    }

    public void print(int includeCellLabel) {
        if (includeCellLabel == 0) {
            System.out.println(this.R0);
        } else if (includeCellLabel == 1) {
            System.out.printf("%s:%d\n", this.label, this.R0);
        }
    }

    public void printChar(int includeCellLabel) {
        if (includeCellLabel == 0) {
            System.out.println((char) this.R0);
        } else if (includeCellLabel == 1) {
            System.out.printf("%s:%c\n", this.label, (char) this.R0);
        }
    }

    public void writeCell(int cellId) {
        this.outPipes.get(cellId).add(this.R0);
    }

    public void readCell(int cellId) {
        Pipe inPipes = this.inPipes.get(cellId);
        if (inPipes.peek() != null) {
            this.R0 = inPipes.pop();
        } else {
            int currFunctionCallId = this.callStack.getCurrFunctionCallId() - 1;
            this.callStack.safePop();
            this.callStack.push(this, currFunctionCallId);
        }
    }

    public void copyCell(int cellId) {
        this.R0 = this.neighbors.get(cellId).getR0();
    }

    public void printLabelName(int cellId) {
        System.out.println(this.neighbors.get(cellId).getLabel());
    }

    public void jump(String extendedDefinedLabel) {
        String[] extendedDefinedLabelParts = extendedDefinedLabel.split("\\$");
        Cell owner;
        if (extendedDefinedLabelParts.length == 1) { // Local scope
            owner = this;
        } else { // Neighbor scope
            owner = getNeighborByLabel(extendedDefinedLabelParts[0]);
        }
        Integer functionCallId;
        String definedLabel = extendedDefinedLabelParts[extendedDefinedLabelParts.length - 1];
        if (Objects.equals(definedLabel, "@")) { // Start
            functionCallId = 0;
        } else { // Specific function call
            functionCallId = owner.getFunctionCallIdForLabel(definedLabel);
        }

        this.callStack.push(owner, functionCallId);
    }

    public void IFEZ(String extendedDefinedLabel) {
        if (this.R0 == 0) {
            jump(extendedDefinedLabel);
        }
    }

    public void IFLZ(String extendedDefinedLabel) {
        if (this.R0 < 0) {
            jump(extendedDefinedLabel);
        }
    }

    public void IFGZ(String extendedDefinedLabel) {
        if (this.R0 > 0) {
            jump(extendedDefinedLabel);
        }
    }

    @Nullable
    private Integer getFunctionCallIdForLabel(String definedLabel) {
        return this.definedLabels.get(definedLabel);
    }

    public FunctionCall getFunctionCall(int functionCallId) {
        return this.functionCalls.get(functionCallId);
    }

    @Nullable
    private Cell getNeighborByLabel(String neighborLabel) {
        return this.neighbors.values().stream()
                .filter(cell -> Objects.equals(cell.getLabel(), neighborLabel))
                .findFirst()
                .orElse(null);
    }

    public boolean isRunning() {
        return this.state == CellState.RUNNING;
    }

    public void setNeighbors(HashMap<Integer, Cell> neighbors) {
        this.neighbors = neighbors;
    }

    public void setInPipes(HashMap<Integer, Pipe> inPipes) {
        this.inPipes = inPipes;
    }

    public void setOutPipes(HashMap<Integer, Pipe> outPipes) {
        this.outPipes = outPipes;
    }

    public Pipe getOutPipe(int toId) {
        return this.outPipes.get(toId);
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

    public int getR0() {
        return R0;
    }

    public int getFunctionCallsCount() {
        return this.functionCalls.size();
    }
}
