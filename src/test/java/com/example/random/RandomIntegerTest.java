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
        RandomInteger randomIntegerEven = randomInteger.even();
        assertSame(randomInteger, randomIntegerEven);
        assertEquals(0, randomInteger.generate() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testOdd() {
        RandomInteger randomInteger = new RandomInteger();
        RandomInteger randomIntegerOdd = randomInteger.odd();
        assertSame(randomInteger, randomIntegerOdd);
        assertEquals(1, randomInteger.generate() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testChained() {
        int min = 0;
        int max = 100;
        RandomInteger randomInteger = new RandomInteger().odd().between(min, max);
        Integer result = randomInteger.generate();
        assertEquals(1, result % 2);
        assertTrue(result > min);
        assertTrue(result < max);
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
