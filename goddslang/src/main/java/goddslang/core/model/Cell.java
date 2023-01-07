package goddslang.core.model;

import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<FunctionCall> functionCalls = new ArrayList<>();
    private List<Cell> neighbors;
    private int currFunctionCallId = 0;
    private int R0 = 0;
    private int R1 = 0;

    public void addFunctionCall(FunctionCall functionCall) {
        this.functionCalls.add(functionCall);
    }

    public void add(int value) {
        this.R0 += value;
    }

    public void setNeighbors(List<Cell> neighbors) {
        this.neighbors = neighbors;
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

    public List<FunctionCall> getfunctionCalls() {
        return functionCalls;
    }

    public int getcurrFunctionCallId() {
        return currFunctionCallId;
    }

    public void setR0(int R0) {
        R0 = R0;
    }

    public void setR1(int R1) {
        R1 = R1;
    }
}
