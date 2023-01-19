package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;

public class CallStack {
    private final Stack<Map.Entry<Cell, Integer>> stack = new Stack<>();
    private int currFunctionCallId = 0;

    public CallStack(Cell cell, int functionCallId) {
        push(cell, functionCallId);
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
            this.currFunctionCallId++;
            push(cell, this.currFunctionCallId);
            return cell.getFunctionCall(functionCallId);
        }
    }

    public void push(Cell cell, int functionCallId) {
        this.stack.push(new AbstractMap.SimpleEntry<>(cell, functionCallId));
    }

    public void safePop() {
        if (!this.stack.empty()) {
            this.stack.pop();
        }
    }

    public int getCurrFunctionCallId() {
        return currFunctionCallId;
    }

    public void setCurrFunctionCallId(int currFunctionCallId) {
        this.currFunctionCallId = currFunctionCallId;
    }
}
