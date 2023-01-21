package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.function.ModifyingFunction;
import goddslang.core.model.Cell;

import java.util.List;

public class Mod extends ModifyingFunction implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        int value = getValue(cell, arguments);
        cell.mod(value);
        return null;
    }
}
