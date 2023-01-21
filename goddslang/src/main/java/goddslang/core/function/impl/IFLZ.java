package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class IFLZ implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        String extendedDefinedLabel = arguments.stream()
                .map(Argument::getValueAsId)
                .collect(Collectors.joining(""));
        cell.IFLZ(extendedDefinedLabel);
    }
}
