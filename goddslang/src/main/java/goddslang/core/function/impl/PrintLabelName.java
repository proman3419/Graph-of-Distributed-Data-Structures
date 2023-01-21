package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;

public class PrintLabelName implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        String label = arguments.get(0).getValueAsId();
        cell.printLabelName(label);
    }
}
