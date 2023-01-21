package goddslang.core.function;

import goddslang.core.function.Argument;
import goddslang.core.model.Cell;

import java.util.List;

public class ModifyingFunction {
    public static int getValue(Cell cell, List<Argument> arguments) {
        int value = -2137;
        if (arguments.get(0).isNumber()) {
            value = arguments.get(0).getValueAsNumber();
        } else {
            String reg = arguments.get(0).getValueAsId();
            if (reg.equals("R0")) {
                value = cell.getR0();
            } else if (reg.equals("R1")) {
                value = cell.getR1();
            }
        }
        return value;
    }
}
