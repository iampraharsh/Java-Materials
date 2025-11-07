package Streams;

import java.util.*;
import java.util.stream.*;

public class TerminalOps {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 🧩 Terminal Operations in Java Streams
        // ---------------------------------------------------------
        // ➤ Terminal operations produce a final result or side-effect
        // ➤ After a terminal operation, the stream pipeline is consumed
        // ➤ Examples: collect(), forEach(), reduce(), count(), findFirst()
        // ---------------------------------------------------------

        List<Integer> list = Arrays.asList(1, 2, 3);

        // ---------------------------------------------------------
        // 1️⃣ collect() → collects elements into a collection
        // ---------------------------------------------------------
        System.out.println("Collect examples:");
        System.out.println(list.stream().skip(1).collect(Collectors.toList())); // [2, 3]

        // ✅ Java 16+ has direct toList() (no need for Collectors)
        System.out.println(list.stream().skip(1).toList()); // [2, 3]

        // ---------------------------------------------------------
        // 2️⃣ forEach() → performs an action for each element
        // ---------------------------------------------------------
        System.out.println("\nforEach example:");
        list.stream().forEach(System.out::println);

        // ---------------------------------------------------------
        // 3️⃣ reduce() → combines elements to produce a single result
        // ---------------------------------------------------------
        Optional<Integer> optionalInteger = list.stream()
                .reduce(Integer::sum); // same as (x, y) -> x + y

        System.out.println("\nReduce (sum): " + optionalInteger.get());

        // ---------------------------------------------------------
        // 4️⃣ count() → returns number of elements in stream
        // ---------------------------------------------------------
        long count = list.stream().count();
        System.out.println("\nCount: " + count);

        // ---------------------------------------------------------
        // 5️⃣ anyMatch(), allMatch(), noneMatch()
        // ---------------------------------------------------------
        // These are short-circuiting operations — stop once condition is met
        System.out.println("\nMatch examples:");
        boolean anyEven = list.stream().anyMatch(x -> x % 2 == 0);
        boolean allPositive = list.stream().allMatch(x -> x > 0);
        boolean noneNegative = list.stream().noneMatch(x -> x < 0);

        System.out.println("Any even? " + anyEven);
        System.out.println("All positive? " + allPositive);
        System.out.println("None negative? " + noneNegative);

        // ---------------------------------------------------------
        // 6️⃣ findFirst(), findAny() → also short-circuit operations
        // ---------------------------------------------------------
        System.out.println("\nFind examples:");
        Integer first = list.stream().findFirst().get();
        Integer any = list.stream().findAny().get();
        System.out.println("findFirst: " + first);
        System.out.println("findAny: " + any);

        // ---------------------------------------------------------
        // 7️⃣ toArray() → converts stream to array
        // ---------------------------------------------------------
        Object[] array = Stream.of(1, 2, 3).toArray();
        System.out.println("\nArray: " + Arrays.toString(array));

        // ---------------------------------------------------------
        // 8️⃣ min() / max() → find minimum or maximum element
        // ---------------------------------------------------------
        System.out.println("\nMin/Max examples:");
        System.out.println("Max: " + Stream.of(2, 44, 69)
                .max(Comparator.naturalOrder()).get());
        System.out.println("Min: " + Stream.of(2, 44, 69)
                .min(Comparator.naturalOrder()).get());

        // ---------------------------------------------------------
        // 9️⃣ forEachOrdered() → preserves encounter order (in parallel streams)
        // ---------------------------------------------------------
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\nUsing forEach with parallel stream:");
        numbers0.parallelStream().forEach(System.out::println);

        System.out.println("\nUsing forEachOrdered with parallel stream:");
        numbers0.parallelStream().forEachOrdered(System.out::println);

        // ---------------------------------------------------------
        // 🔟 Example: Filtering and collecting names
        // ---------------------------------------------------------
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println("\nFiltered names (length > 3):");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // ---------------------------------------------------------
        // Example: Squaring and sorting numbers
        // ---------------------------------------------------------
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println("\nSquared & Sorted:");
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // ---------------------------------------------------------
        // Example: Summing values using reduce()
        // ---------------------------------------------------------
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nSum of integers: " +
                integers.stream().reduce(Integer::sum).get());

        // ---------------------------------------------------------
        // Example: Counting occurrences of a character
        // ---------------------------------------------------------
        String sentence = "Hello World";
        System.out.println("\nOccurrences of 'l': " +
                sentence.chars().filter(ch -> ch == 'l').count());

        // ---------------------------------------------------------
        // Stateful vs Stateless Operations
        // ---------------------------------------------------------
        // ➤ Stateful operations: depend on other elements (e.g., sorted(), distinct(), limit())
        // ➤ Stateless operations: process each element independently (e.g., filter(), map())

        // stateful and stateless operation
        // stateful -> agar koi operation hoga to usko pata hoga baki ke elements ke bare me
        //stateless-> ek element ko ek hi baar dekh raha hai
    }
}
