package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        // A element of Stream that enable parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // this can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        // Parallel streams are most effectively for CPU-intensive or large datasets where tasks are independent (important)
        // They may add overhead for simple or small datasets

        long startTime = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x + 1)
                .limit(20000)
                .toList();

        List<Long> factorialsList = list.stream()
                .map(ParallelStream::factorial)
                .toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();

        factorialsList = list.parallelStream()
                .map(ParallelStream::factorial)
                .toList();

        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");

    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
