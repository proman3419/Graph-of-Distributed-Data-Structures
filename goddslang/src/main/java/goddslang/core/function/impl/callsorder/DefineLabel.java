package goddslang.core.function.impl.callsorder;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class DefineLabel implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        // Does nothing when called, it's used to reference code
        return null;
    }
}
