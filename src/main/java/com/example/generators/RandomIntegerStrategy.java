package com.example.generators;

import java.util.Random;

public class RandomIntegerStrategy extends RandomStrategy<Integer> {

    public RandomIntegerStrategy() {
        super(new Random());
    }

    public Integer next(Integer min, Integer max) {
        return random.nextInt(max-min)+min;
    }

    @Override
    public Integer defaultMax() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Integer defaultMin() {
        return 0;
    }

}
