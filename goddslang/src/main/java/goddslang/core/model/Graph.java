package goddslang.core.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final int cellsCount;
    private final List<Cell> cells;
    private final List<List<Integer>> adjMatrix;

    public Graph(int cellsCount) {
        this.cellsCount = cellsCount;
        this.cells = new ArrayList<>(cellsCount);
        this.adjMatrix = new ArrayList<>(cellsCount);
    }

    public void parse(String graphAdjMatrixRaw) {
        for (int i = 0; i < cellsCount; i++) {
            adjMatrix.add(new ArrayList<>(cellsCount));
            for (int j = 0; j < cellsCount; j++) {
                int toAdd = 0;
                if (i != j) {
                    toAdd = graphAdjMatrixRaw.charAt(i * cellsCount + j);
                }
                adjMatrix.get(i).add(toAdd);
            }
        }
    }

    public void parseCell(String cellHeaderRaw, List<String> cellBodyRaw) {

    }
}
