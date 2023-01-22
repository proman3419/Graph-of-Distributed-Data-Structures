package goddslang.core.function;

import goddslang.utils.notification.Notifier;
import goddslang.utils.notification.RuntimeNotification;
import goddslang.core.model.Cell;

import java.util.List;

public class FunctionCall {
    private final Function function;
    private final List<Argument> arguments;
    private Cell owner;
    private int id;

    public FunctionCall(Function function, List<Argument> arguments) {
        this.function = function;
        this.arguments = arguments;
    }

    public void call(Cell cell) {
        RuntimeNotification runtimeNotification = this.function.call(cell, this.arguments, this);
        if (runtimeNotification != null) {
            Notifier.notifyRuntime(runtimeNotification);
        }
    }

    public Function getFunction() {
        return function;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOwner(Cell owner) {
        this.owner = owner;
    }

    public Cell getOwner() {
        return owner;
    }

    public List<Argument> getArguments() {
        return arguments;
    }
}
