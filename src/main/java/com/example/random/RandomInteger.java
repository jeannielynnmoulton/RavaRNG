package com.example.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class RandomInteger<T extends Number> {

    private final Random random = new Random();

    /**
     * Holds the list of constraints that need to be satisfied
     */
    private final List<Function<Number,Boolean>> constraints = new ArrayList<>();

    /**
     * Max iterations allowed to generate number
     */
    private static final int LIMIT = 100;

    private int min = 0;
    private int max = Integer.MAX_VALUE;

    /**
     * Constrain the result to be even
     */
    public RandomInteger<T> even() {
        constraints.add(i -> (long)i % 2 == 0);
        return this;
    }

    /**
     * Constrain the result to be odd
     */
    public RandomInteger<T> odd() {
        constraints.add(i -> (long)i % 2 == 1);
        return this;
    }

    public Number generate() {
        int counter = 0;
        boolean constraintEval = false;
        Number candidate = null;
        while(counter++ <= LIMIT && !constraintEval) {
            // TODO: this introduces an error for large positive or negative max/min, and this is untested
            candidate = random.nextLong(max-min)+min;
            Number finalCandidate = candidate;
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
    public RandomInteger<T> between(int min, int max) {
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
