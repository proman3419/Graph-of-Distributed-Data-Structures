package goddslang.core.model;

public class Cell {
    private final int id;
    private final String label;
    private int currFunctionId = 0;
//    private List<>

    public Cell(int id, String label) {
        this.id = id;
        this.label = label;
    }
}
