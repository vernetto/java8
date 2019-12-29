package org.pierre.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyFuture {
    public static void main(String[] args) throws  Exception {
        Runnable runme = new Runnable() {
            @Override
            public void run() {
                System.out.println("Pippolino");
            }
        };

        Future<?> myFuture = Executors.newSingleThreadExecutor().submit(runme);
        System.out.println(myFuture.isDone());
        Thread.sleep(5000);
        System.out.println(myFuture.isDone());
        System.out.println(myFuture.get());
        System.out.println(myFuture.isDone());
    }
}
