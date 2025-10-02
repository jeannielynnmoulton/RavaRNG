package com.example.generators;

import java.util.Random;

public abstract class RandomStrategy<T> {
  Random random;

  public RandomStrategy(Random random) {
    this.random = random;
  }

  public abstract T next(T min, T max);

  public abstract T defaultMax();

  public abstract T defaultMin();
}
