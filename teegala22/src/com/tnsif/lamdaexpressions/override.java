package com.tnsif.lamdaexpressions;

class Parent {
    public void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child show method");
    }
}

public class override {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
