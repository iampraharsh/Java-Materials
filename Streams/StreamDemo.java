package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 🌊 Java Streams Overview
        // ---------------------------------------------------------
        // ➤ Introduced in Java 8
        // ➤ Used to process collections of data in a functional and declarative way
        // ➤ Benefits:
        //    - Simplifies Functional Programming (uses Lambdas)
        //    - Improves Readability and Maintainability
        //    - Enables Easy Parallelism
        //
        // Stream Definition:
        // A Stream is a sequence of elements supporting functional-style operations.
        //
        // Stream Pipeline:
        // Source → Intermediate Operations → Terminal Operation
        // ---------------------------------------------------------

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // ---------------------------------------------------------
        // Traditional (Imperative) Way
        // ---------------------------------------------------------
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count (normal way): " + count);

        // ---------------------------------------------------------
        // Stream (Declarative) Way
        // ---------------------------------------------------------
        long streamCount = numbers.stream()
                .filter(x -> x % 2 == 0) // Intermediate operation
                .count();                // Terminal operation
        System.out.println("Even numbers count (stream way): " + streamCount);

        // ---------------------------------------------------------
        // Creating Streams
        // ---------------------------------------------------------

        // 1️⃣ From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // 2️⃣ From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3️⃣ Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        // 4️⃣ Infinite Streams
        // Stream.generate() → generates an infinite stream of constant values
        Stream<Integer> generate = Stream.generate(() -> 1);

        // Stream.iterate() → generates a sequence starting from 1 and increments by 1
        List<Integer> collect = Stream.iterate(1, x -> x + 1)
                .limit(100) // Limit to 100 elements to avoid infinite loop
                .collect(Collectors.toList());

        System.out.println("First 10 numbers: " + collect.subList(0, 10));
    }
}
