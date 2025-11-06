package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        // features introduced in Java 8
        // process collection of data in a functional and declarative manner (means lambda expression lagaa sakte hain)
        // Simplify Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        // What is Stream?
        // A sequence of elements supporting functional and declarative programming.

        // How to use Stream?
        // Source → Intermediate operations → Terminal Operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Normal way
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("even: " + count);

        // Using Stream
        System.out.println("even: " + numbers.stream()
                .filter(x -> x % 2 == 0)
                .count());

        // Creating Streams

        // 1. From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");

        // 4. Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1);

        // iterate() creates a stream of numbers starting from 1
        List<Integer> collect = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .collect(Collectors.toList());

        System.out.println("First 10 numbers: " + collect.subList(0, 10));
        
    }
}
