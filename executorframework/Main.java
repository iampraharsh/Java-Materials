package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println("Factorial of " + finalI + " = " + result);
            });
        }

        executor.shutdown();

        try {
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Waiting...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Total Time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
