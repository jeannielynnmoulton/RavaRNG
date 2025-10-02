package com.example.random;

import static org.junit.jupiter.api.Assertions.*;

import com.example.generators.RandomIntegerStrategy;
import com.example.generators.RandomLongStrategy;
import com.example.generators.RandomStrategy;
import org.junit.jupiter.api.Test;

class RandomIntegerTest {

  /** Good there is a test, bad that it is random. */
  @Test
  void testEven_Integer() {
    RandomStrategy<Integer> strategy = new RandomIntegerStrategy();
    RandomInteger<Integer> randomInteger = new RandomInteger<>(strategy);
    RandomInteger<Integer> randomIntegerEven = randomInteger.even();
    assertSame(randomInteger, randomIntegerEven);
    assertEquals(0, randomInteger.generate() % 2);
  }

  /** Good there is a test, bad that it is random. */
  @Test
  void testOdd_Integer() {
    RandomStrategy<Integer> strategy = new RandomIntegerStrategy();
    RandomInteger<Integer> randomInteger = new RandomInteger<>(strategy);
    RandomInteger<Integer> randomIntegerOdd = randomInteger.odd();
    assertSame(randomInteger, randomIntegerOdd);
    assertEquals(1, randomInteger.generate() % 2);
  }

  /** Good there is a test, bad that it is random. */
  @Test
  void testChained_Integer() {
    int min = 0;
    int max = 100;
    RandomStrategy<Integer> strategy = new RandomIntegerStrategy();
    RandomInteger<Integer> randomInteger = new RandomInteger<>(strategy);
    randomInteger.odd().between(min, max);
    Integer result = randomInteger.generate();
    assertEquals(1, result % 2);
    assertTrue(result > min);
    assertTrue(result < max);
  }

  /** Good there is a test, bad that the result is null - should maybe throw instead. */
  @Test
  void testOddAndEven_Integer() {
    RandomStrategy<Integer> strategy = new RandomIntegerStrategy();
    RandomInteger<Integer> randomInteger = new RandomInteger<>(strategy);
    randomInteger.odd();
    randomInteger.even();
    assertNull(randomInteger.generate());
  }

  /** Good there is a test, bad that it is random. */
  @Test
  void testEven_Long() {
    RandomStrategy<Long> strategy = new RandomLongStrategy();
    RandomInteger<Long> randomInteger = new RandomInteger<>(strategy);
    RandomInteger<Long> randomIntegerEven = randomInteger.even();
    assertSame(randomInteger, randomIntegerEven);
    assertEquals(0, randomInteger.generate() % 2);
  }

  /** Good there is a test, bad that it is random. */
  @Test
  void testOdd_Long() {
    RandomStrategy<Long> strategy = new RandomLongStrategy();
    RandomInteger<Long> randomInteger = new RandomInteger<>(strategy);
    RandomInteger<Long> randomIntegerOdd = randomInteger.odd();
    assertSame(randomInteger, randomIntegerOdd);
    assertEquals(1, randomInteger.generate() % 2);
  }

  /** Good there is a test, bad that it is random. */
  @Test
  void testChained_Long() {
    long min = 0;
    long max = 100;
    RandomStrategy<Long> strategy = new RandomLongStrategy();
    RandomInteger<Long> randomInteger = new RandomInteger<>(strategy);
    randomInteger.odd().between(min, max);
    Long result = randomInteger.generate();
    assertEquals(1, result % 2);
    assertTrue(result > min);
    assertTrue(result < max);
  }

  /** Good there is a test, bad that the result is null - should maybe throw instead. */
  @Test
  void testOddAndEven_Long() {
    RandomStrategy<Long> strategy = new RandomLongStrategy();
    RandomInteger<Long> randomInteger = new RandomInteger<>(strategy);
    randomInteger.odd();
    randomInteger.even();
    assertNull(randomInteger.generate());
  }
}
