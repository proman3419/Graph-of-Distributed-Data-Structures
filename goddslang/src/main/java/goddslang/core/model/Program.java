package goddslang.core.model;

public class Program {
    private Graph graph;
    private Bus bus;

    public void run() {

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
