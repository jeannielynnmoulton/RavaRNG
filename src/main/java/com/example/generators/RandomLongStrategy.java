package com.example.generators;

import java.util.Random;

public class RandomLongStrategy extends RandomStrategy<Long>{

    public RandomLongStrategy() {
        super(new Random());
    }

    public Long next(Long min, Long max) {
        return random.nextLong(max-min)+min;
    }

}
