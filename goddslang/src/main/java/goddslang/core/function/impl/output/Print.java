package goddslang.core.function.impl.output;

import goddslang.utils.notification.NotificationType;
import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;
import java.util.stream.Collectors;

public class Print implements Function {
    @Override
    public RuntimeNotification call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String val = arguments.stream()
                .map(Argument::getValueAsId)
                .limit(arguments.size() - 1)
                .collect(Collectors.joining(" "));
        int includeCellLabel = arguments.get(arguments.size() - 1).getValueAsNumber();
        int errorCode = cell.print(val, includeCellLabel);
        if (errorCode == 1) {
            return new RuntimeNotification(NotificationType.RUNTIME_WARNING, cell, functionCall, "Invalid flag value, assumed flag = 0");
        }
        return null;
    }
}
