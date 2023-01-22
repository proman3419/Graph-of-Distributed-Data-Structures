package goddslang.core.model;

public enum CellOption {
    DAEMON,
    INACTIVE;

    public static CellOption fromString(String string) {
        CellOption result = null;
        try {
            result = CellOption.valueOf(string.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Handled in Listener, requires access to expression
        }
        return result;
    }
}
