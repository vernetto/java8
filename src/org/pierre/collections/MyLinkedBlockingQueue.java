package org.pierre.collections;

import java.util.concurrent.LinkedBlockingQueue;

public class MyLinkedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue  linkedBlockingQueue = new LinkedBlockingQueue();
        linkedBlockingQueue.put("PIPPO");
        linkedBlockingQueue.put("PLUTO");
        System.out.println(linkedBlockingQueue);
        Object bla1 = linkedBlockingQueue.peek();
        System.out.println(bla1);
        Object bla2 = linkedBlockingQueue.take();
        System.out.println(bla2);
        Object bla3 = linkedBlockingQueue.take();
        System.out.println(bla3);
        Object bla4 = linkedBlockingQueue.take();
        System.out.println(bla4);

        System.out.println(linkedBlockingQueue);
    }
}
