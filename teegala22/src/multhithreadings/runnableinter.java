package multhithreadings;

class runnableinter implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        runnableinter r = new runnableinter();
        Thread t = new Thread(r);
        t.start();
    }
}
