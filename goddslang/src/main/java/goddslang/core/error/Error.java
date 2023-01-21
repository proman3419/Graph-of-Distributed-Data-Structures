package goddslang.core.error;

import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

public class Error {
    private final ErrorType errorType;
    private final Cell cell;
    private final FunctionCall functionCall;
    private final String description;

    public Error(ErrorType errorType, Cell cell, FunctionCall functionCall, String description) {
        this.errorType = errorType;
        this.cell = cell;
        this.functionCall = functionCall;
        this.description = description;
    }

    public ErrorType getErrorType() {
        return errorType;
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
