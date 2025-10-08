package com.tnsif.task9;

public class wait{

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is waiting...");
                try {
                    lock.wait(); // t1 waits until notified
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Thread 1 resumed.");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is notifying...");
                lock.notify(); // t2 notifies t1
            }
        });

        t1.start();
        try {
            Thread.sleep(1000); // Ensure t1 starts first
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
