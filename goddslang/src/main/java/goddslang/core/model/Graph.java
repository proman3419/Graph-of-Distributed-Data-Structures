package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public void completeSetup() {
        for (int i = 0; i < this.cellsCount; i++) {
            Cell cell = this.cells.get(i);
            HashMap<Integer, Cell> neighbors = new HashMap<>();
            HashMap<Integer, Pipe> outPipes = new HashMap<>();
            for (int j = 0; j < this.cellsCount; j++) {
                if (this.adjMatrix.get(i).get(j) == 1) {
                    neighbors.put(j, this.cells.get(j));
                    outPipes.put(j, new Pipe(this.cells.get(i), this.cells.get(j)));
                }
            }
            cell.setNeighbors(neighbors);
            cell.setOutPipes(outPipes);
        }
        for (int i = 0; i < this.cellsCount; i++) {
            Cell cell = this.cells.get(i);
            HashMap<Integer, Pipe> inPipes = new HashMap<>();
            for (int j = 0; j < this.cellsCount; j++) {
                if (this.adjMatrix.get(j).get(i) == 1) {
                    inPipes.put(j, this.cells.get(j).getOutPipe(i));
                }
            }
            cell.setInPipes(inPipes);
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
