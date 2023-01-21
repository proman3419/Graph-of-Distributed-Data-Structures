package goddslang.core.function;

import goddslang.core.model.Cell;
import org.codehaus.plexus.util.cli.Arg;

import java.util.List;

public class FunctionCall {
    private final Function function;
    private final List<Argument> arguments;
//    private final int id;

    public FunctionCall(Function function, List<Argument> arguments) {
        this.function = function;
        this.arguments = arguments;
//        this.id = id;
    }

    public void call(Cell cell) {
        this.function.call(cell, this.arguments);
    }

    public Function getFunction() {
        return function;
    }

    public List<Argument> getArguments() {
        return arguments;
    }
}
