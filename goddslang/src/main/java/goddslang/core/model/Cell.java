package goddslang.core.model;

import goddslang.core.function.FunctionCall;
import goddslang.core.function.impl.DefineLabel;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<FunctionCall> functionCalls = new ArrayList<>();
    private final HashMap<String, Integer> definedLabels = new HashMap<>();
    private HashMap<Integer, Cell> neighbors;
    private HashMap<Integer, Pipe> inPipes;
    private HashMap<Integer, Pipe> outPipes;
    private Bus bus;
    private CallStack callStack = new CallStack(this, 0);
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

    public void set(String registerId, int value) {
        if (registerId.equals("R0")) {
            this.R0 = value;
        } else if (registerId.equals("R1")) {
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

    public void print(String val, int includeCellLabel) {
        String label = "";
        if (includeCellLabel == 1) {
            label = this.label + ":";
        }
        if (val.equals("R0")) {
            System.out.printf("%s%d", label, this.R0);
        } else if (val.equals("R1")) {
            System.out.printf("%s%d", label, this.R1);
        } else {
            System.out.printf("%s%s", label, val);
        }
    }

    public void printNL(String val, int includeCellLabel) {
        String label = "";
        if (includeCellLabel == 1) {
            label = this.label + ":";
        }
        if (val.equals("R0")) {
            System.out.printf("%s%d\n", label, this.R0);
        } else if (val.equals("R1")) {
            System.out.printf("%s%d\n", label, this.R1);
        } else {
            System.out.printf("%s%s\n", label, val);
        }
    }

    public void printChar(String val, int includeCellLabel) {
        String label = "";
        if (includeCellLabel == 1) {
            label = this.label + ":";
        }
        if (val.equals("R0")) {
            System.out.printf("%s%c", label, (char) this.R0);
        } else if (val.equals("R1")) {
            System.out.printf("%s%c", label, (char) this.R1);
        }
    }

    public void printNLChar(String val, int includeCellLabel) {
        String label = "";
        if (includeCellLabel == 1) {
            label = this.label + ":";
        }
        if (val.equals("R0")) {
            System.out.printf("%s%c\n", label, (char) this.R0);
        } else if (val.equals("R1")) {
            System.out.printf("%s%c\n", label, (char) this.R1);
        }
    }

    public void writeCell(String label) {
        Pipe pipe = getPipeOutputByLabel(label);
        this.outPipes.get(pipe.getToCell().getId()).add(this.R0);
    }

    public void readCell(String label) {
        Pipe pipe = getPipeInputByLabel(label);
        Pipe inPipes = this.inPipes.get(pipe.getFromCell().getId());
        if (inPipes.peek() != null) {
            this.R0 = inPipes.pop();
        } else {
            int currFunctionCallId = this.callStack.getCurrFunctionCallId() - 1;
            this.callStack.safePop();
            this.callStack.push(this, currFunctionCallId);
        }
    }

    public void readBus() {
        if (this.bus.peek() != null) {
            this.R0 = this.bus.pop();
        }
    }

    public void copyCell(int cellId) {
        this.R0 = this.neighbors.get(cellId).getR0();
    }

    public void printLabelName(int cellId) {
        System.out.println(this.neighbors.get(cellId).getLabel());
    }

    public void pass(int val) {
        this.idleStepsCount = val;
    }

    public void jump(String extendedDefinedLabel) {
        String[] extendedDefinedLabelParts = extendedDefinedLabel.split("@");
        Cell owner;
        if (extendedDefinedLabelParts.length == 1) { // Local scope
            owner = this;
            this.callStack.safePop(); // Don't return to the place from which the jump has been made
        } else { // Neighbor scope
            owner = getNeighborByLabel(extendedDefinedLabelParts[0]);
        }
        Integer functionCallId;
        String definedLabel = extendedDefinedLabelParts[extendedDefinedLabelParts.length - 1];
        if (Objects.equals(definedLabel, "^")) { // Start
            functionCallId = 0;
        } else if (Objects.equals(definedLabel, "$")) { // End
            functionCallId = owner.getFunctionCallsCount() - 1;
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
    @Nullable
    private Pipe getPipeOutputByLabel(String neighborLabel) {
        return this.outPipes.values().stream()
                .filter(pipe -> pipe.getToCell().getLabel().equals(neighborLabel))
                .findFirst()
                .orElse(null);
    }

    @Nullable
    private Pipe getPipeInputByLabel(String neighborLabel) {
        return this.inPipes.values().stream()
                .filter(pipe -> Objects.equals(pipe.getFromCell().getLabel(), neighborLabel))
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

    public void setBusPipe(Bus bus) {
        this.bus = bus;
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
