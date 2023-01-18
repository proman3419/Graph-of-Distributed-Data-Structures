package goddslang.core.function;

import goddslang.core.model.Cell;

import java.util.List;

public class FunctionCall {
    private final Function function;
    private final List<Argument> arguments;

    public FunctionCall(Function function, List<Argument> arguments) {
        this.function = function;
        this.arguments = arguments;
    }

    public void call(Cell cell) {
        this.function.call(cell, this.arguments);
    }
}
