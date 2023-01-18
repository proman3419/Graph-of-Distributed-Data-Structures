package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<FunctionCall> functionCalls = new ArrayList<>();
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

    public void writeCell(int cellId) {
        this.outPipes.get(cellId).add(this.R0);
    }

    public void readCell(int cellId) {
        Pipe outPipe = this.outPipes.get(cellId);
        if (outPipe.peek() != null) {
            this.R0 = outPipe.pop();
        }
    }

    public void copyCell(int cellId) {
        this.R0 = this.neighbors.get(cellId).getR0();
    }

    public void printLabelName(int cellId) {
        System.out.println(this.neighbors.get(cellId).getLabel());
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

    public FunctionCall getFunctionCall(int functionCallId) {
        return this.functionCalls.get(functionCallId);
    }

    public boolean isRunning() {
        return this.state == CellState.RUNNING;
    }
}
