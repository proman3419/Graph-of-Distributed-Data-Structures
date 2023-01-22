package goddslang.core.function.impl;

import goddslang.utils.notification.NotificationType;
import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class CopyCell implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String label = arguments.get(0).getValueAsId();
        int errorCode = cell.copyCell(label);
        if (errorCode == 1) {
            return new RuntimeNotification(NotificationType.RUNTIME_ERROR, cell, functionCall, "Can't read from the cell");
        }
        return null;
    }
}
