package com.tnsif.inheritance;

public class hybrid {

    static class Owner {
        int sal1 = 20000;
        int sal2 = 30000;
        int sal3 = 40000;

        public void show() {
            System.out.println("I am the Owner");
        }
    }

    static class Manager extends Owner {
        public void Salary() {
            System.out.println("The salary of Manager: " + sal1);
        }
    }

    static class Employee extends Manager {
        public void display() {
            System.out.println("The salary of Employee: " + sal2);
        }
    }

    static class Dailywager extends Manager {
        public void display2() {
            System.out.println("The salary of DailyWager: " + sal3);
        }
    }

    public static void main(String[] args) {
        Owner m = new Owner();
        Employee e = new Employee();
        Dailywager d = new Dailywager();

        m.show();
        d.Salary();
        e.display();
        d.display2();
    }
}
