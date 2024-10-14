package Java21;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadsExample {
    public static void main(String[] args) {
        var executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.execute(() -> System.out.println("Hello from a virtual thread!"));

        executor.shutdown();

        try {
            // Wait for the tasks to finish (max wait of 1 second)
            if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Executor did not terminate in the specified time.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
    When using virtual threads, which are lightweight, their execution can be so fast
    that the main thread might terminate before the virtual thread finishes its task.
 */