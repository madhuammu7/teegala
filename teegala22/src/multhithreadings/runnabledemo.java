package multhithreadings;

class RunnableInf implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Hello from thread: " + Thread.currentThread().getName());
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class runnabledemo {
    public static void main(String[] args) {
        RunnableInf ri = new RunnableInf();
        Thread t1 = new Thread(ri);
        t1.start();
    }
}
