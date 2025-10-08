package com.tnsif.exceptions;

public class throwsdemo {

    static class Hello {
        public Hello() throws Exception {
            String s = "Hello World"; // Assign a non-null value
            int len = s.length();     // Safe access
            System.out.println("Length of string: " + len);
        }
    }

    public static void main(String[] args) {
        try {
            Hello h = new Hello();
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
