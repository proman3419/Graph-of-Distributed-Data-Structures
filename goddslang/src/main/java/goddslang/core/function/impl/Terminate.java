package goddslang.core.function.impl;

import goddslang.core.function.Argument;
import goddslang.core.function.Function;
import goddslang.core.model.Cell;

import java.util.List;

public class Terminate implements Function {
    @Override
    public void call(Cell cell, List<Argument> arguments) {
        cell.terminate();
    }
}