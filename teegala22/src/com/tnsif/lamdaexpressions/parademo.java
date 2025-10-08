package com.tnsif.lamdaexpressions;

@FunctionalInterface
interface WithPara {
    int hello(int a);
}

public class parademo {

    public static void main(String[] args) {
        WithPara w = (a) -> {
            System.out.println("The value of a is: " + a);
            return a;
        };

        w.hello(5);
    }
}
