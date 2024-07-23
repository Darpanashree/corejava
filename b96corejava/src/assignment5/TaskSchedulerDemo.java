package assignment5;

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Task 1: Print a message every 2 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 1: Executing every 2 seconds"), 2);

        // Task 2: Print a message every 5 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 2: Executing every 5 seconds"), 5);

        // Task 3: Print a message every 10 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 3: Executing every 10 seconds"), 10);

        // Keep the main thread alive for a while to observe the output
        try {
            Thread.sleep(30000); // Run for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the scheduler
        scheduler.stopScheduler();
    }
}
