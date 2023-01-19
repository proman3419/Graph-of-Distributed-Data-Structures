package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;

public class ReadCell implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        int cellId = arguments.get(0).getValueAsNumber();
        cell.readCell(cellId);
    }
}
