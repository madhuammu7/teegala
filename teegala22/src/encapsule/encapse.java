package encapsule;

public class encapse {

    String color = "blue";
    int seats = 4;
    String company = "TATA";

    public void start() {
        System.out.println("The car has started");
    }

    void stop() {
        int b = 20;
        System.out.println("The car has stopped");
    }

    public static void main(String[] args) {
        encapse car = new encapse();
        System.out.println("Car color: " + car.color);
        System.out.println("Car seats: " + car.seats);
        System.out.println("Car company: " + car.company);
        car.start();
        car.stop();
    }
}
