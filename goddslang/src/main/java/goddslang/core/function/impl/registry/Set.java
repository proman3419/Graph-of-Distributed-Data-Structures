package goddslang.core.function.impl.registry;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class Set implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String registerId = arguments.get(0).getValueAsId();
        int value = arguments.get(1).getValueAsNumber();
        cell.set(registerId, value);
        return null;
    }
}
