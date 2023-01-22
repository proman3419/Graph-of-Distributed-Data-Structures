package goddslang.core.function.impl;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.utils.notification.NotificationType;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.function.ModifyingFunction;
import goddslang.core.model.Cell;

import java.util.List;

public class Div extends ModifyingFunction implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        int value = getValue(cell, arguments);
        int errorCode = cell.div(value);
        if (errorCode == 1) {
            return new RuntimeNotification(NotificationType.RUNTIME_ERROR, cell, functionCall, "Division by zero");
        }
        return null;
    }
}
