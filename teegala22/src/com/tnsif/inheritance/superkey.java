package com.tnsif.inheritance;

public class superkey {

    static class Base {
        int a = 10;
    }

    static class Derived extends Base {
        int a = 20;

        public void hello() {
            System.out.println("Derived class a: " + a);       // prints 20
            System.out.println("Base class a: " + super.a);     // prints 10
        }
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.hello();
    }
}
