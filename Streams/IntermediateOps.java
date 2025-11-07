package Streams;

import java.util.*;
import java.util.stream.*;

import static java.util.Arrays.asList;

public class IntermediateOps {

    public static void main(String[] args) {

        // ---------------------------
        // Intermediate Operations in Streams
        // ---------------------------
        // 1️⃣ Transform a stream into another stream.
        // 2️⃣ They are lazy — nothing runs until a terminal operation (like count(), forEach()) is called.

        List<String> list = asList("Akshit", "Ram", "Shaym", "Ghanshyam", "Akshit");

        // ---------------------------
        // 1. filter() → filters elements based on condition
        // ---------------------------
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));

        // No filtering happens yet (lazy evaluation)
        long result = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println("Count of names starting with 'A': " + result);

        // ---------------------------
        // 2. map() → transforms elements
        // ---------------------------
        System.out.println("\nNames in uppercase:");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // ---------------------------
        // 3. sorted() → sorts elements
        // ---------------------------
        System.out.println("\nSorted alphabetically:");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nSorted by length:");
        list.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);

        // ---------------------------
        // 4. distinct() → removes duplicates
        // ---------------------------
        long distinctCount = list.stream()
                .filter(x -> x.startsWith("A"))
                .distinct()
                .count();
        System.out.println("\nUnique names starting with 'A': " + distinctCount);

        // ---------------------------
        // 5. limit() → limits number of elements
        // ---------------------------
        System.out.println("\nUsing limit():");
        long limitedCount = Stream.iterate(1, x -> x + 1)
                .limit(100)
                .count();
        System.out.println("Count of first 100 numbers: " + limitedCount);

        // ---------------------------
        // 6. skip() → skips first N elements
        // ---------------------------
        System.out.println("\nUsing skip():");
        long skippedCount = Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .count();
        System.out.println("Count after skipping first 10: " + skippedCount);

        //7 . Peek -> performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();


        //8. flatMap
        // Handle streams of collections, lists, or arrays where each elements is itself a collection
        // Flatten nested structure (e.g. lists within lists) so that they can be processed as a simple sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        System.out.println(listOfLists.get(1).get(1));

        System.out.println(
                listOfLists.stream()
                        .flatMap(x -> x.stream())
                        .map(String::toUpperCase)
                        .toList()
        );

    }
}
