package goddslang.core.model;

import goddslang.core.function.Function;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int id;
    private final String label;
    private final List<Function> functions = new ArrayList<>();
    private List<Cell> neighbors;
    private int currFunctionId = 0;


    public Cell(int id, String label) {
        this.id = id;
        this.label = label;
    }

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

    public List<Function> getFunctions() {
        return functions;
    }

    public int getCurrFunctionId() {
        return currFunctionId;
    }
}
