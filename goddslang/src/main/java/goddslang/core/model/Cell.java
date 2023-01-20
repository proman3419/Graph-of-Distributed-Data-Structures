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

    public int getR1() {
        return R1;
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
