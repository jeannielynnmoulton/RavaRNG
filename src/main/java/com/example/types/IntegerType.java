package com.example.types;

/**
 * Wrapper for the Integer java class for use in Random
 */
public class IntegerType extends Number implements IntegralType {
    private final Integer value;

    public IntegerType(Integer integer) {
        this.value = integer;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }
}
