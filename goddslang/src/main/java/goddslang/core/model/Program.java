package goddslang.core.model;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
                    applyCellOptions(runningCells);
                    cell.step();
                }
            });
        }
    }

    private void applyCellOptions(List<Cell> runningCells) {
        boolean terminateDaemonCells = runningCells.stream()
                .allMatch(cell -> cell.getCellOptions().contains(CellOption.DAEMON)); // Check if all non daemon cells have terminated
        for (Cell cell : runningCells) {
            for (CellOption cellOption : cell.getCellOptions()) {
                switch(cellOption) {
                    case DAEMON:
                        if (terminateDaemonCells) {
                            cell.terminate();
                        }
                        break;
                    case INACTIVE:
                        cell.terminate();
                        break;
                }
            }
        }
    }

    public void init(int cellsCount) {
        this.graph = new Graph(cellsCount);
    }

    public void createCell(int id, String label, Set<CellOption> cellOptions) {
        Cell cell = this.graph.getCells().get(id);
        cell.setId(id);
        cell.setLabel(label);
        cell.setCellOptions(cellOptions);
        this.graph.setCurrCell(cell);
    }

    public Graph getGraph() {
        return graph;
    }

    public static void setTerminate(boolean terminate) {
        Program.terminate = terminate;
    }
}
