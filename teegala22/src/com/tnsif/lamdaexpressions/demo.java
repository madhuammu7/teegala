package com.tnsif.lamdaexpressions;

@FunctionalInterface
interface A {
    void show();
}

public class demo {

    public static void main(String[] args) {
        A ob = () -> System.out.println("This is show method");
        ob.show();
    }
}
