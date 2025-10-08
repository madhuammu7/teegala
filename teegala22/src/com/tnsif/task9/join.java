package com.tnsif.task9;

class joindemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class join {
    public static void main(String[] args) {
        joindemo t1 = new joindemo();
        joindemo t2 = new joindemo();

        t1.start();
        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start(); // Starts only after t1 completes
    }
}
