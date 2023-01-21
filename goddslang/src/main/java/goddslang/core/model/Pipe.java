package goddslang.core.model;

import java.util.LinkedList;

public class Pipe {
    private Cell from;
    private Cell to;
    private LinkedList<Integer> queue = new LinkedList<>();

    public Pipe(Cell from, Cell to) {
        this.from = from;
        this.to = to;
    }

    public Integer peek() {
        return this.queue.peek();
    }

    public Integer pop() {
        return this.queue.pop();
    }

    public void add(int value) {
        this.queue.add(value);
    }

    public Cell getFromCell() {
        return this.from;
    }

    public Cell getToCell() {
        return this.to;
    }
}
