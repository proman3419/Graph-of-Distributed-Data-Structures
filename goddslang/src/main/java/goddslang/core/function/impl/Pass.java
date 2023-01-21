package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;

public class Pass implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        int value = 1;
        if (arguments.size() > 0) {
            value = arguments.get(0).getValueAsNumber();
        }
        cell.pass(value);
    }
}