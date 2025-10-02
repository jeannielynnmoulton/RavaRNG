package com.example.generators;

import java.util.Random;

/**
 * This base class handles random number generation for different types.
 *
 * @param <T> The number type for the random strategy
 */
public abstract class RandomStrategy<T extends Number> {
  Random random;

  public RandomStrategy(Random random) {
    this.random = random;
  }

  public abstract T next(T min, T max);

  public abstract T defaultMax();

  public abstract T defaultMin();
}
