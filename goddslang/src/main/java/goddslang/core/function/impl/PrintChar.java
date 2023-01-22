package goddslang.core.function.impl;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class PrintChar implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String val = arguments.stream()
                .map(Argument::getValueAsId)
                .limit(arguments.size() - 1)
                .collect(Collectors.joining(" "));
        int includeCellLabel = arguments.get(arguments.size() - 1).getValueAsNumber();
        cell.printChar(val, includeCellLabel);
        return null;
    }
}
