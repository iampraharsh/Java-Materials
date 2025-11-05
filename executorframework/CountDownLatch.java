package executorframework;

import java.util.concurrent.*;

public class CountDownLatch {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        // Use fully qualified class name to avoid confusion
        java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        // Main thread waits until all services call countDown()
        latch.await();

        System.out.println("Main");

        executorService.shutdown();
    }

    static class DependentService implements Callable<String> {

        private final java.util.concurrent.CountDownLatch latch;

        public DependentService(java.util.concurrent.CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " service started.");
                Thread.sleep(2000); // simulate work
            } finally {
                latch.countDown(); // signal task completion
            }
            return "ok";
        }
    }
}
