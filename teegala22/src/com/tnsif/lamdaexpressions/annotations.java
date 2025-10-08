package com.tnsif.lamdaexpressions;

public class annotations {

    @FunctionalInterface
    interface Aaa {
        void show();
    }

    public static void main(String[] args) {
        Aaa obj = () -> System.out.println("Functional Interface method executed!");
        obj.show();
    }
}
