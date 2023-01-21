package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class PrintChar implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        String val = arguments.stream()
                .map(Argument::getValueAsId)
                .limit(arguments.size() - 1)
                .collect(Collectors.joining(" "));
        int includeCellLabel = arguments.get(arguments.size() - 1).getValueAsNumber();
        cell.printChar(val, includeCellLabel);
    }
}
