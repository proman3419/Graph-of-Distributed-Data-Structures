package goddslang.core.function.impl.callsorder;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class Exit implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        cell.exit();
        return null;
    }
}
