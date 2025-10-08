package encapsule;

import java.util.ArrayList;
import java.util.LinkedList;

class Prg1 {
    String color = "blue";
    int seats = 4;
    String company = "TATA";

    public void start() {
        System.out.println("The car has started");
    }

    public void stop() {
        System.out.println("The car has stopped");
    }
}

public class mains {

    public static void main(String[] args) {
        Prg1 obj = new Prg1();
        System.out.println("Color: " + obj.color);
        System.out.println("Seats: " + obj.seats);
        System.out.println("Company: " + obj.company);
        obj.start();
        obj.stop();

        ArrayList<String> li = new ArrayList<>();
        li.add("Hii");

        System.out.println("ArrayList contents: " + li);
    }
}
