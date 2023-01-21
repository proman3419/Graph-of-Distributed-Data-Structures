package goddslang.core.error;

public enum ErrorType {
    ERROR("\u001B[31m"),
    WARNING("\u001B[33m"),
    INFO("\u001B[34m");

    public final String color;

    private ErrorType(String color) {
        this.color = color;
    }
}
