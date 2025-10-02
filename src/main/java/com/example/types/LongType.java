package com.example.types;

/**
 * Wrapper for the Integer java class for use in Random
 */
public class LongType extends Number implements IntegralType {
    private final Long value;

    public LongType(Long integer) {
        this.value = integer;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value;
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
