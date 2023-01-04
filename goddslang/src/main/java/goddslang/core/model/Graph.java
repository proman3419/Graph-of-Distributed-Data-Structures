package goddslang.core.model;

import java.util.ArrayList;
import java.util.List;

// Add Graph builder wrapper
public class Graph {
    private final int cellsCount;
    private final List<Cell> cells;
    private final List<List<Integer>> adjMatrix;
    private int currCellId;

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

    public void createCell(int cellId, String cellHeaderRaw) {
        this.cells.set(cellId, new Cell(cellId, cellHeaderRaw));
        this.currCellId = cellId;
    }

    public void addCellFunction(List<String> cellBodyPartRaw) {
        this.cells.get(this.currCellId).addFunction(cellBodyPartRaw);
    }

    public void setNeighbors() {
        for (int i = 0; i < this.cellsCount; i++) {
            List<Cell> neighbors = new ArrayList<>();
            for (int j = 0; j < this.cellsCount; j++) {
                if (this.adjMatrix.get(i).get(j) == 1) {
                    neighbors.add(this.cells.get(j));
                }
            }
            this.cells.get(i).setNeighbors(neighbors);
        }
    }
}
