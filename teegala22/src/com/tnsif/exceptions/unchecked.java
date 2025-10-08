package com.tnsif.exceptions;

public class unchecked {

    static class Sample {
        int a = 4, b = 10;
        int c = a / b;

        public void show() {
            System.out.println("Result: " + c);
        }
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.show();
    }
}
