package com.example.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomLongTest {

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testEven() {
        RandomLong RandomLong = new RandomLong();
        RandomLong RandomLongEven = RandomLong.even();
        assertSame(RandomLong, RandomLongEven);
        assertEquals(0, RandomLong.generate() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testOdd() {
        RandomLong RandomLong = new RandomLong();
        RandomLong RandomLongOdd = RandomLong.odd();
        assertSame(RandomLong, RandomLongOdd);
        assertEquals(1, RandomLong.generate() % 2);
    }

    /**
     * Good there is a test, bad that it is random.
     */
    @Test
    void testChained() {
        int min = 0;
        int max = 100;
        RandomLong RandomLong = new RandomLong().odd().between(min, max);
        Long result = RandomLong.generate();
        assertEquals(1, result % 2);
        assertTrue(result > min);
        assertTrue(result < max);
    }

    /**
     * Good there is a test, bad that the result is null - should maybe throw instead.
     */
    @Test
    void testOddAndEven() {
        RandomLong RandomLong = new RandomLong();
        RandomLong.odd();
        RandomLong.even();
        assertNull(RandomLong.generate());
    }

}
