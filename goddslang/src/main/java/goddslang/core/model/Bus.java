package goddslang.core.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bus {
    private final Queue<Integer> queue = new LinkedList<>();
    private final List<Integer> order = new ArrayList<>();
    private final List<Cell> neighbors;

    public Bus(int cellsCount) {
        this.neighbors = IntStream.range(0, cellsCount)
                .mapToObj(i -> new Cell())
                .collect(Collectors.toList());
    }

    public void push(int value) {
        this.queue.add(value);
    }

    public void addNeighbor(Cell neighbor) {
        this.neighbors.set(neighbor.getId(), neighbor);
    }

    public List<Integer> getOrder() {
        return order;
    }
}
