package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 🌐 Parallel Streams in Java
        // ---------------------------------------------------------
        // ➤ Parallel streams enable concurrent (multi-threaded) processing.
        // ➤ Useful for CPU-intensive or large, independent datasets.
        // ➤ They split data into multiple chunks and process them in parallel.
        // ➤ For small datasets, the overhead may make it slower.
        // ---------------------------------------------------------

        // Record start time
        long startTime = System.currentTimeMillis();

        // Generate a list of integers from 1 to 20,000
        List<Integer> list = Stream.iterate(1, x -> x + 1)
                .limit(20000)
                .toList();

        // ---------------------------------------------------------
        // Sequential Stream (Single Thread)
        // ---------------------------------------------------------
        List<Long> factorialsList = list.stream()
                .map(ParallelStream::factorial)  // Process elements one by one
                .toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        // ---------------------------------------------------------
        // Parallel Stream (Multi-Threaded)
        // ---------------------------------------------------------
        startTime = System.currentTimeMillis();

        factorialsList = list.parallelStream()
                .map(ParallelStream::factorial)  // Process elements in parallel threads
                .toList();

        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");
    }

    // ---------------------------------------------------------
    // Helper Method: Calculate factorial of a number
    // ---------------------------------------------------------
    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
