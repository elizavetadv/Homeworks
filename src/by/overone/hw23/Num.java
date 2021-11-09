package by.overone.hw23;

public class Num<T extends Number> {
    private T value;

    public T giveResult(Double result, Num<?> value1){
        if (value instanceof Long) {
            if(result >= Long.MIN_VALUE && result <= Long.MAX_VALUE) {
                return (T) Long.valueOf(result.longValue());
            } else{
                throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
            }
        }

        if (value instanceof Double) {
            if(result >= Double.MIN_VALUE && result <= Double.MAX_VALUE) {
                return (T) Double.valueOf(result);
            } else{
                throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
            }
        }

        if (value instanceof Integer) {

            if (value1.getValue() instanceof Long) {
                try {
                    Math.toIntExact((long) value1.getValue());
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
                }
            } else {
                return (T) Integer.valueOf(result.intValue());
            }

        }

        if (value instanceof Float) {
            if(result >= Float.MIN_VALUE && result <= Float.MAX_VALUE) {
                return (T) Float.valueOf(result.floatValue());
            } else{
                throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
            }
        }

        if (value instanceof Short) {
            if(result >= Short.MIN_VALUE && result <= Short.MAX_VALUE) {
                return (T) Short.valueOf(result.shortValue());
            } else{
                throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
            }
        }

        if (value instanceof Byte) {
            if(result >= Byte.MIN_VALUE && result <= Byte.MAX_VALUE) {
                return (T) Byte.valueOf(result.byteValue());
            } else{
                throw new IllegalArgumentException("Type " + value1.getValue().getClass() + " does not fit in the type " + value.getClass());
            }
        }

        return null;
    }

    public Double sum(Num<?> value1) {
        return value.doubleValue() + value1.getValue().doubleValue();
    }

    public Double difference(Num<?> value1) {
        return value.doubleValue() - value1.getValue().doubleValue();

    }

    public Double composition(Num<?> value1) {
        return value.doubleValue() * value1.getValue().doubleValue();
    }

    public Double division(Num<?> value1) {

        if (value1.getValue().doubleValue() == 0) {
            return null;
        }

        return value.doubleValue() / value1.getValue().doubleValue();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
