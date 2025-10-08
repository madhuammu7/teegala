package com.tnsif.task3;


class Parent {
    void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class method.");

        // Call the parent class method using super
        super.display();
    }
}

public class superkey {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
