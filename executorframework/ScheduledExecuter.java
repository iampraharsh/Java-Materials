package executorframework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuter {
    public static void main(String[] args) {

        // Create a scheduler with 2 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Runs every 5 seconds, after an initial delay of 5 seconds
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed every 5 seconds!"),
                5,
                5,
                TimeUnit.SECONDS
        );

        // Runs repeatedly with a 5-second delay between the end and next start
        scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed with 5-second delay!"),
                5,
                5,
                TimeUnit.SECONDS
        );

        // Schedules a shutdown after 20 seconds
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
