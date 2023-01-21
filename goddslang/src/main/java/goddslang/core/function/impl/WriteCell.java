package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.error.ErrorType;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.model.Cell;

import java.util.List;

public class WriteCell implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        String label = arguments.get(0).getValueAsId();
        int errorCode = cell.writeCell(label);
        if (errorCode == 1) {
            return new Error(ErrorType.ERROR,
                    cell,
                    functionCall,
                    "Write error");
        }
        return null;
    }
}
