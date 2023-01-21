package goddslang.core.function;

import goddslang.core.model.Cell;
import goddslang.core.error.Error;

import java.util.List;

public interface Function {
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall);
}
