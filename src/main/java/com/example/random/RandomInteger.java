package com.example.random;

import com.example.generators.RandomIntegerStrategy;
import com.example.generators.RandomStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RandomInteger<T extends Number> {

    private final RandomStrategy<T> randomStrategy;

    /**
     * Holds the list of constraints that need to be satisfied
     */
    private final List<Function<T,Boolean>> constraints = new ArrayList<>();

    /**
     * Max iterations allowed to generate number
     */
    private static final int LIMIT = 100;

    private T min;
    private T max;

    public RandomInteger(RandomStrategy<T> strategy) {
        this.randomStrategy = strategy;
        this.max = randomStrategy.defaultMax();
        this.min = randomStrategy.defaultMin();
    }

    /**
     * Constrain the result to be even
     */
    public RandomInteger<T> even() {
        constraints.add(i -> i.longValue() % 2 == 0);
        return this;
    }

    /**
     * Constrain the result to be odd
     */
    public RandomInteger<T> odd() {
        constraints.add(i -> i.longValue() % 2 == 1);
        return this;
    }

    public T generate() {
        int counter = 0;
        boolean constraintEval = false;
        T candidate = null;
        while(counter++ <= LIMIT && !constraintEval) {
            // TODO: this introduces an error for large positive or negative max/min, and this is untested
            candidate = randomStrategy.next(min, max);
            T finalCandidate = candidate;
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
    public RandomInteger<T> between(T min, T max) {
        if (min.longValue() >= max.longValue()) {
            throw new IllegalArgumentException("min must be less than max");
        }
        // TODO: the constraint does not match the description and is untested.
        // TODO: it also does not address this issue of multiple calls to between
        this.min = min;
        this.max = max;
        return this;
    }
}
