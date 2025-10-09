package com.tnsif.inheritance;

public class singleinheritance {

    int a = 10;

    public void show() {
        System.out.println("This is class A");
    }

    // Inner class B to keep everything in one file
    static class B extends singleinheritance {
        public void display() {
            System.out.println("This is class B");
        }

        public static void main(String[] args) {
            B obj = new B();
            obj.show();     // Inherited from class A
            obj.display();  // Defined in class B
        }
    }
}
