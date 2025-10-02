package com.example.generators;

import java.util.Random;

/** Random number generation for Long. */
public class RandomLongStrategy extends RandomStrategy<Long> {

  public RandomLongStrategy() {
    super(new Random());
  }

  public Long next(Long min, Long max) {
    return random.nextLong(max - min) + min;
  }

  @Override
  public Long defaultMax() {
    return Long.MAX_VALUE;
  }

  @Override
  public Long defaultMin() {
    return 0L;
  }
}
