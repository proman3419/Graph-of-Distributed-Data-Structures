package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Add Graph builder wrapper
public class Graph {
    private final int cellsCount;
    private final List<Cell> cells;
    private final List<List<Integer>> adjMatrix;
    private Cell currCell;

    public Graph(int cellsCount) {
        this.cellsCount = cellsCount;
        this.cells = IntStream.range(0, cellsCount)
                .mapToObj(i -> new Cell())
                .collect(Collectors.toList());
        this.adjMatrix = new ArrayList<>(cellsCount);
    }

    public void parseAdjMatrix(List<String> graphAdjMatrixRaw) {
        for (int i = 0; i < cellsCount; i++) {
            adjMatrix.add(new ArrayList<>(cellsCount));
            for (int j = 0; j < cellsCount; j++) {
                int toAdd = 0;
                if (i != j) {
                    toAdd = Character.getNumericValue(graphAdjMatrixRaw.get(i).charAt(j));
                }
                adjMatrix.get(i).add(toAdd);
            }
        }
    }

    public void addCellFunctionCall(FunctionCall functionCall) {
        this.currCell.addFunctionCall(functionCall);
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

    public List<Cell> getCells() {
        return cells;
    }

    public void setCurrCell(Cell currCell) {
        this.currCell = currCell;
    }

    public Cell getCurrCell() {
        return currCell;
    }
}
