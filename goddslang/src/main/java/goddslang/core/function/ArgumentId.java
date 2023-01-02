package goddslang.core.function;

public class ArgumentId implements Argument {
    private final int order;
    private final String value;

    public ArgumentId(int order, String value) {
        this.order = order;
        this.value = value;
    }

    public int getOrder() {
        return order;
    }

    public String getValue() {
        return value;
    }
}
