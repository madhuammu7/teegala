package com.tnsif.task4;
public class Counter {

    // Static variable shared across all instances
    static int count = 0;

    // Constructor increments the static count
    Counter() {
        count++;
        System.out.println("Object created. Current count: " + count);
    }

    // Static method to display the count
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Display total count using static method
        Counter.displayCount();
    }
}
