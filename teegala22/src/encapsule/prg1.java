package encapsule;

class prg1 {
    protected String color = "Black";
    int seats = 6;
    String company = "Benz";

    public void start() {
        int a = 10;
        System.out.println("The car has started");
    }

    void stop() {
        System.out.println("The car has stopped");
    }
}

class Hello extends prg1 {
    void show() {
        System.out.println("Color from parent class: " + color);
    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.show();
        System.out.println("Seats: " + obj.seats);
        System.out.println("Company: " + obj.company);
        obj.start();
        obj.stop();
    }
}
