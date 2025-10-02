package com.example.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/**
 * Generates a random integer subject to constraints. Results can be chained.
 * For example {@code new RandomInteger().even().between(1, 100)}.
 */
public class RandomLong {
    private final Random random = new Random();
    private final List<Function<Long,Boolean>> constraints = new ArrayList<>();
    /**
     * Max iterations allowed to generate number
     */
    private static final int LIMIT = 100;

    // TODO: defaults are not stated in the documentation
    private long min = 0;
    private long max = Long.MAX_VALUE;

    /**
     * Constrain the result to be even
     */
    public RandomLong even() {
        constraints.add(i -> i % 2 == 0);
        return this;
    }

    /**
     * Constrain the result to be odd
     */
    public RandomLong odd() {
        constraints.add(i -> i % 2 == 1);
        return this;
    }

    public Long generate() {
        int counter = 0;
        boolean constraintEval = false;
        Long candidate = null;
        while(counter++ <= LIMIT && !constraintEval) {
            // TODO: this introduces an error for large positive or negative max/min, and this is untested
            candidate = random.nextLong(max-min)+min;
            Long finalCandidate = candidate;
            constraintEval = constraints.stream()
                    .map(constraint -> constraint.apply(finalCandidate))
                    .reduce(true, (previous, result) -> previous & result);
        }
        return counter > LIMIT ? null : candidate;
    }

    /**
     * Constrains the result to be between min and max, inclusive
     * @param min the min value, inclusive
     * @param max the max value, inclusive
     */
    public RandomLong between(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be less than max");
        }
        // TODO: the constraint does not match the description and is untested.
        // TODO: it also does not address this issue of multiple calls to between
        this.min = min;
        this.max = max;
        return this;
    }
}

