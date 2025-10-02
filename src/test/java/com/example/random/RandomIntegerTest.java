package com.example.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomIntegerTest {

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testEven_Integer() {
        RandomInteger<Integer> randomInteger = new RandomInteger<>();
        RandomInteger<Integer> randomIntegerEven = randomInteger.even();
        assertSame(randomInteger, randomIntegerEven);
        assertEquals(0, randomInteger.generate().intValue() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testOdd_Integer() {
        RandomInteger<Integer> randomInteger = new RandomInteger<>();
        RandomInteger<Integer> randomIntegerOdd = randomInteger.odd();
        assertSame(randomInteger, randomIntegerOdd);
        assertEquals(1, randomInteger.generate().intValue() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testChained_Integer() {
        int min = 0;
        int max = 100;
        RandomInteger<Integer> randomInteger = new RandomInteger<Integer>().odd().between(min, max);
        Number result = randomInteger.generate();
        assertEquals(1, result.intValue() % 2);
        assertTrue(result.intValue() > min);
        assertTrue(result.intValue() < max);
    }

    /**
     * Good there is a test, bad that the result is null - should maybe throw instead.
     */
    @Test
    void testOddAndEven_Integer() {
        RandomInteger<Integer> randomInteger = new RandomInteger<>();
        randomInteger.odd();
        randomInteger.even();
        assertNull(randomInteger.generate());
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testEven_Long() {
        RandomInteger<Long> randomInteger = new RandomInteger<>();
        RandomInteger<Long> randomIntegerEven = randomInteger.even();
        assertSame(randomInteger, randomIntegerEven);
        assertEquals(0, randomInteger.generate().longValue() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testOdd_Long() {
        RandomInteger<Long> randomInteger = new RandomInteger<>();
        RandomInteger<Long> randomIntegerOdd = randomInteger.odd();
        assertSame(randomInteger, randomIntegerOdd);
        assertEquals(1, randomInteger.generate().longValue() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testChained_Long() {
        int min = 0;
        int max = 100;
        RandomInteger<Long> randomInteger = new RandomInteger<Long>().odd().between(min, max);
        Number result = randomInteger.generate();
        assertEquals(1, result.longValue() % 2);
        assertTrue(result.longValue() > min);
        assertTrue(result.longValue() < max);
    }

    /**
     * Good there is a test, bad that the result is null - should maybe throw instead.
     */
    @Test
    void testOddAndEven_Long() {
        RandomInteger<Long> randomInteger = new RandomInteger<>();
        randomInteger.odd();
        randomInteger.even();
        assertNull(randomInteger.generate());
    }

}
