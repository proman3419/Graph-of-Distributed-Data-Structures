package goddslang.core.error;

import goddslang.core.model.Program;

public class ErrorReporter {
    private static final String ANSI_RESET = "\u001B[0m";

    public static void report(Error error) {
        System.out.printf("%s[ executor label: %s | function call owner: %s | function call id: %d | %s ]%s\n",
                error.getErrorType().color, error.getCell().getLabel(), error.getFunctionCall().getOwner().getLabel(),
                error.getFunctionCall().getId(), error.getDescription(), ANSI_RESET);
        if (error.getErrorType() == ErrorType.ERROR) {
            Program.setTerminate(true);
        }
    }
}
