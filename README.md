# RavaRNG
A library for generating random numbers with constraints in Java. 

Intended to showcase software engineering best practices using
1) git/Github
2) Github Actions and automated testing
3) JUnit and testing best practices
4) Software design principles, interfaces, abstraction, error recovery, etc.

over different commits and is a work-in-progress.

## Usage

Current capabilities include generating random integers or longs subject
to configurable constraints like even, odd or in a range. 

Example usage:
```
RandomInteger<Integer> randomInteger = new RandomInteger<>(new RandomIntegerStrategy());
Integer result = randomInteger.odd().between(0, 100).generate();
```

## Contributing

Please contribute changes through pull requests. Spotless is used to check
formatting. Run
```
mvn spotless:apply
```
on each commit to avoid formatting and whitespace diffs.
