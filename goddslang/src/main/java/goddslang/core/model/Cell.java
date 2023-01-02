package goddslang.core.model;

import goddslang.core.function.Function;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int id;
    private final String label;
    private final List<Function> functions;
    private List<Cell> neighbors;
    private int currFunctionId = 0;

    public Cell(int id, String label, List<String> cellBodyRaw) {
        this.id = id;
        this.label = label;
        this.functions = parseBody(cellBodyRaw);
    }

    private List<Function> parseBody(List<String> cellBodyRaw) {
        return null;
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
