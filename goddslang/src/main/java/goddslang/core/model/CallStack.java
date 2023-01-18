package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;

public class CallStack {
    private final Stack<Map.Entry<Cell, Integer>> stack = new Stack<>();

    public CallStack(Cell cell, int functionCallId) {
        this.stack.push(new AbstractMap.SimpleEntry<>(cell, functionCallId));
    }

    public FunctionCall getFunctionCall() {
        if (this.stack.peek() == null) {
            return null;
        }
        Map.Entry<Cell, Integer> stackTop = this.stack.peek();
        Cell cell = stackTop.getKey();
        int functionCallId = stackTop.getValue();

        this.stack.pop();
        if (functionCallId >= cell.getFunctionCallsCount()) {
            return this.stack.empty() ? null : getFunctionCall();
        } else {
            this.stack.push(new AbstractMap.SimpleEntry<>(cell, functionCallId + 1));
            return cell.getFunctionCall(functionCallId);
        }
    }
}
