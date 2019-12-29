package org.pierre.collections;

import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class MySemaphore {
    static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        IntStream.range(1, 15).forEach((i) -> {
            System.out.println(i);
            System.out.println("getQueueLength1=" + semaphore.getQueueLength());
            //System.out.println("tryAcquire=" + semaphore.tryAcquire());
            System.out.println("getQueueLength2=" + semaphore.getQueueLength());

            try {
                        semaphore.acquire();
                System.out.println("availablePermits=" + semaphore.availablePermits());

            } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

    }
}
