package Streams;

import java.util.*;                    // For Arrays and Random
import java.util.stream.*;             // For IntStream, DoubleStream, Collectors

public class PrimitiveStreams {

    public static void main(String[] args) {

        // ---------------------------
        // Primitive Streams in Java
        // ---------------------------
        // Java provides specialized streams for primitive types:
        // IntStream, LongStream, DoubleStream
        // → These avoid unnecessary boxing/unboxing overhead.

        // 1️⃣ Create IntStream from array
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);

        // ---------------------------
        // 2️⃣ range() vs rangeClosed()
        // ---------------------------
        // range(start, end)       → end is exclusive
        // rangeClosed(start, end) → end is inclusive
        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));      // [1, 2, 3, 4]
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList())); // [1, 2, 3, 4, 5]

        // ---------------------------
        // 3️⃣ Creating IntStream using of()
        // ---------------------------
        IntStream.of(1, 2, 3).forEach(System.out::println);

        // ---------------------------
        // 4️⃣ DoubleStream from Random
        // ---------------------------
        // Generates 5 random double values between 0.0 and 1.0
        DoubleStream doubles = new Random().doubles(5);

        // ⚠️ Stream is one-time use — after a terminal operation, it can’t be reused.
        // So, here we collect to a list first.
        System.out.println(doubles.boxed().toList());

        // ---------------------------
        // 5️⃣ IntStream from Random
        // ---------------------------
        // Generates 5 random integers (unbounded)
        IntStream intStream = new Random().ints(5);
        System.out.println(intStream.boxed().toList());

        // ---------------------------
        // Optional Statistical Operations (Commented for clarity)
        // ---------------------------
        // doubles.sum();
        // doubles.min();
        // doubles.max();
        // doubles.average();
        // doubles.summaryStatistics();
        // doubles.mapToInt(x -> (int) x + 1);
    }
}
