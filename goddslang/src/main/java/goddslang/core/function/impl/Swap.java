package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class Swap implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        cell.swap();
        return null;
    }
}
