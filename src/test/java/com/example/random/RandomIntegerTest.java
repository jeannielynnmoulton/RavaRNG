package com.example.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomIntegerTest {

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testEven() {
        RandomInteger randomInteger = new RandomInteger();
        randomInteger.even();
        assertEquals(0, randomInteger.generate() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testOdd() {
        RandomInteger randomInteger = new RandomInteger();
        randomInteger.odd();
        assertEquals(1, randomInteger.generate() % 2);
    }

    /**
     * Good there is a test, bad that the result is null - should maybe throw instead.
     */
    @Test
    void testOddAndEven() {
        RandomInteger randomInteger = new RandomInteger();
        randomInteger.odd();
        randomInteger.even();
        assertNull(randomInteger.generate());
    }

}
