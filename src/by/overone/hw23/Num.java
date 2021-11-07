package by.overone.hw23;

public class Num<T extends Number> {
    private T value;

    public T sum(Num<?> value1) {

        if (value instanceof Integer) {
            return (T) Integer.valueOf(value.intValue() + value1.getValue().intValue());
        } else if (value instanceof Double) {
            return (T) Double.valueOf(value.doubleValue() + value1.getValue().doubleValue());
        } else if (value instanceof Byte) {
            return (T) Byte.valueOf((byte) (value.byteValue() + value1.getValue().byteValue()));
        } else if (value instanceof Float) {
            return (T) Float.valueOf(value.floatValue() + value1.getValue().floatValue());
        } else if (value instanceof Long) {
            return (T) Long.valueOf(value.longValue() + value1.getValue().longValue());
        } else if (value instanceof Short) {
            return (T) Short.valueOf((short) (value.shortValue() + value1.getValue().shortValue()));
        } else {
            throw new IllegalArgumentException("Type " + value.getClass() + " is not supported by this method");
        }

    }

    public T difference(Num<?> value1) {
        return getValue();
    }

    public T composition(Num<?> value1) {
        return getValue();
    }

    public T division(Num<?> value1) {
        return getValue();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
