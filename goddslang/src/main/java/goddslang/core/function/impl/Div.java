package goddslang.core.function.impl;

import goddslang.core.error.Error;
import goddslang.core.error.ErrorType;
import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.function.FunctionCall;
import goddslang.core.function.ModifyingFunction;
import goddslang.core.model.Cell;

import java.util.List;

public class Div extends ModifyingFunction implements Function {
    @Override
    public Error call(Cell cell, List<Argument> arguments, FunctionCall functionCall) {
        int value = getValue(cell, arguments);
        int errorCode = cell.div(value);
        if (errorCode == 1) {
            return new Error(ErrorType.ERROR,
                    cell,
                    functionCall,
                    "Division by zero");
        }
        return null;
    }
}
