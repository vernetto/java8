package org.pierre.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService executor10 = Executors.newFixedThreadPool(10);
        ExecutorService executor1 = Executors.newSingleThreadExecutor();

        executor10.submit(getRunning());
        executor10.submit(getRunning());
        executor10.submit(getRunning());
        executor10.shutdownNow();

    }

    private static Runnable getRunning() {
        return () -> {
            System.out.println("running1");
            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e) {};
            System.out.println("running2");
        };
    }
}
