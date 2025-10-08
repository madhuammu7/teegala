package com.tnsif.lamdaexpressions;

@FunctionalInterface
interface Showable {
    void show();
}

public class java {

    public static void main(String[] args) {
        Showable s = () -> System.out.println("Functional interface method executed!");
        s.show();
    }
}
