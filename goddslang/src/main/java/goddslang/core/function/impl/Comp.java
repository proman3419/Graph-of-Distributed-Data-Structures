package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.ModifyingFunction;
import goddslang.core.model.Cell;

import java.util.List;

public class Comp extends ModifyingFunction implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        int value = getValue(cell, arguments);
        cell.comp(value);
    }
}
