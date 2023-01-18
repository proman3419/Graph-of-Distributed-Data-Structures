package goddslang.core.model;

import java.util.List;

public class Program {
    private Graph graph;
    private Bus bus;

    public void run() {
        for (;;) {
            List<Cell> runningCells = this.graph.getCells().stream()
                    .filter(Cell::isRunning)
                    .toList();
            if (runningCells.isEmpty()) {
                return;
            }
            runningCells.forEach(Cell::step);
        }
    }

    public void init(int cellsCount) {
        this.graph = new Graph(cellsCount);
        this.bus = new Bus(cellsCount);
    }

    public void createCell(int id, String label) {
        Cell cell = this.graph.getCells().get(id);
        cell.setId(id);
        cell.setLabel(label);
        this.graph.setCurrCell(cell);

        this.bus.addNeighbor(cell);
    }

    public Graph getGraph() {
        return graph;
    }

    public Bus getBus() {
        return bus;
    }
}
