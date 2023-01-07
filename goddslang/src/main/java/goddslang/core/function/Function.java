package goddslang.core.function;

import goddslang.core.model.Cell;

import java.util.List;

public interface Function {
    public void call(Cell cell, List<Argument> arguments);
}
