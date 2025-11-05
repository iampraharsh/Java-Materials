package executorframework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Running in background: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed!");
        });

        System.out.println("Main thread continues...");

        // Wait for the async task to finish
        future.join();
        System.out.println("Main thread done.");
    }
}
