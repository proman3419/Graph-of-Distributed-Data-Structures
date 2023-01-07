package goddslang.core.function;

import java.util.List;

public class FunctionCall {
    private final Function function;
    private final List<Argument> arguments;

    public FunctionCall(Function function, List<Argument> arguments) {
        this.function = function;
        this.arguments = arguments;
    }
}
