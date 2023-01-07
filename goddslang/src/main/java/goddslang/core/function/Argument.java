package goddslang.core.function;

import io.vavr.control.Either;

public class Argument {
    private final Either<String, Integer> value;

    public Argument(String value) {
        this.value = Either.left(value);
    }

    public Argument(Integer value) {
        this.value = Either.right(value);
    }

    public String getValueAsId() {
        return value.getLeft();
    }

    public Integer getValueAsNumber() {
        return value.get();
    }
}
