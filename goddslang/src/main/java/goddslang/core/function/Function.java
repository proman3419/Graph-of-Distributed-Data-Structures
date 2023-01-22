package goddslang.core.function;

import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.model.Cell;

import java.util.List;

public interface Function {
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall);
}
