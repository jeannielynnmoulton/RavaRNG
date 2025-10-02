package com.example.generators;

import java.util.Random;

public class RandomIntegerStrategy extends RandomStrategy<Integer> {

    public RandomIntegerStrategy() {
        super(new Random());
    }

    public Integer next(Integer min, Integer max) {
        return random.nextInt(max-min)+min;
    }

}
