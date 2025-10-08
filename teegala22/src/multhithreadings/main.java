package multhithreadings;

class PriorityDemo extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() +
                           " with priority: " + Thread.currentThread().getPriority());
    }
}

public class main {
    public static void main(String[] args) {
        PriorityDemo p1 = new PriorityDemo();
        PriorityDemo p2 = new PriorityDemo();

        p1.setPriority(1);   // Lowest priority
        p2.setPriority(10);  // Highest priority

        p1.start();
        p2.start();
    }
}
