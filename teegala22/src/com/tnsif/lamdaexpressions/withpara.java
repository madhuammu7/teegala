package com.tnsif.lamdaexpressions;

@FunctionalInterface
interface withpara {
    int hello(int a);
}

public class withpara {

    public static void main(String[] args) {
        WithPara wp = (a) -> {
            System.out.println("The value of a is: " + a);
            return a;
        };

        int result = wp.hello(10);
        System.out.println("Returned value: " + result);
    }
}
