package multhithreadings;

class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() +
                           " with priority: " + Thread.currentThread().getPriority());
    }
}

public class mainthread {
    public static void main(String[] args) {
        ThreadDemo d = new ThreadDemo();
        d.setPriority(1);  // Lowest priority
        d.start();

        ThreadDemo d1 = new ThreadDemo();
        d1.setPriority(10); // Highest priority
        d1.start();
    }
}
