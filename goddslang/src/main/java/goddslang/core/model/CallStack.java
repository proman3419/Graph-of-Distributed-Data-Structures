package goddslang.core.model;

import goddslang.core.function.FunctionCall;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;

public class CallStack {
    private final Stack<Map.Entry<Cell, Integer>> stack = new Stack<>();

    public CallStack(Cell cell, int functionCallId) {
        push(cell, functionCallId);
    }

    public FunctionCall getFunctionCall() {
        if (this.stack.peek() == null) {
            return null;
        }
        Map.Entry<Cell, Integer> stackTop = this.stack.peek();
        Cell cell = stackTop.getKey();
        int functionCallId = getCurrFunctionCallId();

        this.stack.pop();
        if (functionCallId >= cell.getFunctionCallsCount()) {
            return this.stack.empty() ? null : getFunctionCall();
        } else {
            functionCallId++;
            push(cell, functionCallId);
            return cell.getFunctionCall(functionCallId - 1);
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
        return this.stack.peek().getValue();
    }
//
//    public void setCurrFunctionCallId(int currFunctionCallId) {
//        if (!this.currFunctionCallIds.isEmpty()) {
//            this.currFunctionCallIds.pop();
//        }
//        this.currFunctionCallIds.push(currFunctionCallId);
//    }
}
