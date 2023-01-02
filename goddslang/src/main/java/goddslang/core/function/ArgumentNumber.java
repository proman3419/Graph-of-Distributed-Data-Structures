package goddslang.core.function;

public class ArgumentNumber {
    private final int order;
    private final int value;

    public ArgumentNumber(int order, int value) {
        this.order = order;
        this.value = value;
    }

    public int getOrder() {
        return order;
    }

    public int getValue() {
        return value;
    }
}
