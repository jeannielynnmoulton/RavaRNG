package com.example.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/**
 * Generates a random integer subject to constraints.
 * TODO: the results cannot be chained, so this should be fixed in later work
 */
public class RandomInteger {
    private final Random random = new Random();
    private final List<Function<Integer,Boolean>> constraints = new ArrayList<>();
    /**
     * Max iterations allowed to generate number
     */
    private static final int LIMIT = 100;

    /**
     * Constrain the result to be even
     */
    public void even() {
        constraints.add(i -> i % 2 == 0);
    }

    /**
     * Constrain the result to be odd
     */
    public void odd() {
        constraints.add(i -> i % 2 == 1);
    }

    public Integer generate() {
        int counter = 0;
        boolean constraintEval = false;
        Integer candidate = null;
        while(counter++ <= LIMIT && !constraintEval) {
            candidate = random.nextInt();
            int finalCandidate = candidate;
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
    public void between(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be less than max");
        }
        // TODO: the constraint does not match the description and is untested.
        constraints.add(i -> i > min && i < max);
    }
}

