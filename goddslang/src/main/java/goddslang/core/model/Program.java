package goddslang.core.model;

import java.util.List;

public class Program {
    private Graph graph;
    private static boolean terminate = false;

    public void run() {
        while (!terminate) {
            List<Cell> runningCells = this.graph.getCells().stream()
                    .filter(Cell::isRunning)
                    .toList();
            if (runningCells.isEmpty()) {
                return;
            }
            runningCells.forEach(cell -> {
                if (!terminate) {
                    cell.step();
                }
            });
        }
    }

    public void init(int cellsCount) {
        this.graph = new Graph(cellsCount);
    }

    public void createCell(int id, String label) {
        Cell cell = this.graph.getCells().get(id);
        cell.setId(id);
        cell.setLabel(label);
        this.graph.setCurrCell(cell);
    }

    public Graph getGraph() {
        return graph;
    }

    public static void setTerminate(boolean terminate) {
        Program.terminate = terminate;
    }
}
