package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;


public class CollectorsDemo {

    public static void main(String[] args) {

        // ---------------------------
        // 1️⃣ Collecting to a List
        // ---------------------------
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + res);

        // ---------------------------
        // 2️⃣ Collecting to a Set
        // ---------------------------
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream()
                .collect(Collectors.toSet());
        System.out.println("Unique numbers: " + set);

        // ---------------------------
        // 3️⃣ Collecting to a Specific Collection
        // ---------------------------
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println("Collected into ArrayDeque: " + collect);

        // ---------------------------
        // 4️⃣ Joining Strings
        // ---------------------------
        String concatenatedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + concatenatedNames);

        // ---------------------------
        // 5️⃣ Summarizing Data
        // ---------------------------
        // Generates a statistical summary (count, sum, min, avg, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);

        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(x -> x));

        System.out.println("\n--- Summary Statistics ---");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // ---------------------------
        // 6️⃣ Calculating Averages
        // ---------------------------
        Double average = numbers.stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println("\nAverage: " + average);

        // ---------------------------
        // 7️⃣ Counting Elements
        // ---------------------------
        Long count = numbers.stream()
                .collect(Collectors.counting());
        System.out.println("Count: " + count);

        // ---------------------------
        // 8️⃣ Grouping Elements
        // ---------------------------
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");

        System.out.println("\n--- Grouping Examples ---");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));

        // Grouping with TreeMap
        TreeMap<Integer, Long> treeMap = words.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println("Grouped into TreeMap: " + treeMap);

        // ---------------------------
        // 9️⃣ Partitioning Elements
        // ---------------------------
        // Splits elements into two groups (true / false)
        System.out.println("\nPartitioned by word length > 5: ");
        System.out.println(words.stream()
                .collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // ---------------------------
        // 🔟 Mapping and Collecting
        // ---------------------------
        System.out.println("\nMapped to Uppercase and Collected:");
        System.out.println(words.stream()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));

        // ---------------------------
        // Example 1: Collecting Names by Length
        // ---------------------------
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println("\nNames grouped by length:");
        System.out.println(l1.stream()
                .collect(Collectors.groupingBy(String::length)));

        // ---------------------------
        // Example 2: Counting Word Occurrences
        // ---------------------------
        String sentence = "hello world hello java world";
        System.out.println("\nWord occurrences:");
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // ---------------------------
        // Example 3: Partitioning Even and Odd Numbers
        // ---------------------------
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("\nEven/Odd Partition:");
        System.out.println(l2.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // ---------------------------
        // Example 4: Summing Values in a Map
        // ---------------------------
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);

        System.out.println("\nSum of all values (using reduce): " +
                items.values().stream().reduce(Integer::sum).get());
        System.out.println("Sum of all values (using Collector): " +
                items.values().stream().collect(Collectors.summingInt(x -> x)));

        // ---------------------------
        // Example 5: Creating a Map from Stream Elements
        // ---------------------------
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("\nFruits to Map (Uppercase → Length):");
        System.out.println(fruits.stream()
                .collect(Collectors.toMap(String::toUpperCase, String::length)));

        // ---------------------------
        // Example 6: Counting Duplicate Words
        // ---------------------------
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println("\nWord frequency map:");
        System.out.println(words2.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum)));
    }
}
