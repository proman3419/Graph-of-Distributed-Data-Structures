package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class IFGZ implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String extendedDefinedLabel = arguments.stream()
                .map(Argument::getValueAsId)
                .collect(Collectors.joining(""));
        cell.IFGZ(extendedDefinedLabel);
        return null;
    }
}
