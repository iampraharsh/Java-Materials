package Streams;

import java.util.*;
import java.util.stream.*;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        // ---------------------------
        // Lazy Evaluation in Streams
        // ---------------------------
        // Streams in Java are lazy — intermediate operations
        // (like filter(), map()) are not executed until a
        // terminal operation (like collect(), count(), forEach()) is called.

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Creating a Stream with a filter operation
        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        // Intermediate operations above (filter) are lazy,
        // so nothing executes yet.
        System.out.println("Before terminal operation");

        // Terminal operation triggers execution of the stream pipeline
        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After terminal operation");
        System.out.println("Filtered Names: " + result);
    }
}
