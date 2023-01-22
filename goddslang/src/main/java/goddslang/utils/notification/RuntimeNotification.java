package goddslang.utils.notification;

import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

public class RuntimeNotification {
    private final NotificationType notificationType;
    private final Cell cell;
    private final FunctionCall functionCall;
    private final String description;

    public RuntimeNotification(NotificationType notificationType, Cell cell, FunctionCall functionCall, String description) {
        this.notificationType = notificationType;
        this.cell = cell;
        this.functionCall = functionCall;
        this.description = description;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public Cell getCell() {
        return cell;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public String getDescription() {
        return description;
    }
}
