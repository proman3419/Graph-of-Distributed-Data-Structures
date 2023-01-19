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
