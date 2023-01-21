package goddslang.core.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bus {
    private LinkedList<Integer> queue = new LinkedList<>();

    public Bus() {
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
}
