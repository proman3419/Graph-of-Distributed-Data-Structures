package goddslang.core.function.impl;

import goddslang.utils.notification.NotificationType;
import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class IFEZ implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String extendedDefinedLabel = arguments.stream()
                .map(Argument::getValueAsId)
                .collect(Collectors.joining(""));
        int errorCode = cell.IFEZ(extendedDefinedLabel, functionCall.getOwner());
        if (errorCode == 1) {
            return new RuntimeNotification(NotificationType.RUNTIME_ERROR, cell, functionCall, "Not a neighbor");
        } else if (errorCode == 2) {
            return new RuntimeNotification(NotificationType.RUNTIME_ERROR, cell, functionCall, "Invalid label name");
        }
        return null;
    }
}
