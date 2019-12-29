package org.pierre.concurrency;

import java.util.concurrent.*;

public class MyScheduledFuture {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        Future<String> future = executorService.schedule(() -> {
            return "Hello world";
        }, 1, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture = executorService.schedule(() -> {
        }, 1, TimeUnit.SECONDS);

    }
}
