package goddslang.utils.notification;

public class ParseNotification {
    private final NotificationType notificationType;
    private final String expression;
    private final String description;

    public ParseNotification(NotificationType notificationType, String expression, String description) {
        this.notificationType = notificationType;
        this.expression = expression;
        this.description = description;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getExpression() {
        return expression;
    }

    public String getDescription() {
        return description;
    }
}
