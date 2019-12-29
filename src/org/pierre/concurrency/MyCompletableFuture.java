package org.pierre.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCompletableFuture {
    public static void main(String[] args) throws Exception {
        MyCompletableFuture myCompletableFuture = new MyCompletableFuture();
        System.out.println("1 " + Thread.currentThread().getName());
        Future<String> myvar = myCompletableFuture.calculateAsync();
        System.out.println("2 " + Thread.currentThread().getName());
        System.out.println(myvar.get());
        System.out.println("3 " + Thread.currentThread().getName());

    }

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        System.out.println("4 " + Thread.currentThread().getName());
        Executors.newCachedThreadPool().submit(() -> {
            System.out.println("5 " + Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println("6 " + Thread.currentThread().getName());
            completableFuture.complete("Hello");
            System.out.println("7 " + Thread.currentThread().getName());
            return null;
        });
        System.out.println("8 " + Thread.currentThread().getName());
        return completableFuture;
    }
}
