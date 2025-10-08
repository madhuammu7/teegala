package encapsule;

class encapse {
    String color = "blue";
    int seats = 4;
    String company = "TATA";

    public void start() {
        System.out.println("The car has started");
    }

    void stop() {
        System.out.println("The car has stopped");
    }
}

public class encapsulations {
    public static void main(String[] args) {
        encapse ob = new encapse();
        System.out.println("Car color: " + ob.color);
        System.out.println("Car seats: " + ob.seats);
        System.out.println("Car company: " + ob.company);

        ob.start();
        ob.stop();
    }
}
