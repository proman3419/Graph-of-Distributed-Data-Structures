package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.error.ErrorType;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class ReadCell implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        int cellId = arguments.get(0).getValueAsNumber();
        int errorCode = cell.readCell(cellId);
        if (errorCode == 1) {
            return new Error(ErrorType.ERROR,
                    cell,
                    functionCall,
                    "Read error");
        }
        return null;
    }
}
