package goddslang.utils.notification;

public enum NotificationType {
    PARSE_ERROR("\u001B[41m"),
    PARSE_WARNING("\u001B[43m"),
    PARSE_INFO("\u001B[44m"),
    RUNTIME_ERROR("\u001B[31m"),
    RUNTIME_WARNING("\u001B[33m"),
    RUNTIME_INFO("\u001B[34m");

    public final String color;

    private NotificationType(String color) {
        this.color = color;
    }
}
