package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;

public class Set implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        int registerId = arguments.get(0).getValueAsNumber();
        int value = arguments.get(1).getValueAsNumber();
        cell.set(registerId, value);
    }
}
