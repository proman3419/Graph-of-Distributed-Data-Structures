package goddslang.core.model;

import goddslang.core.function.Function;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int id = -1;
    private String label = "DUMMY";
    private final List<Function> functions = new ArrayList<>();
    private List<Cell> neighbors;
    private int currFunctionId = 0;

    public void addFunction(List<String> cellBodyPartRaw) {
//        this.functions.add(new Function(cellBodyPartRaw));
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

    public List<Function> getFunctions() {
        return functions;
    }

    public int getCurrFunctionId() {
        return currFunctionId;
    }
}
