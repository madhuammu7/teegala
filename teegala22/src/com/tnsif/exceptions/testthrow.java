package com.tnsif.exceptions;

public class testthrow {

    public static void calAge(int age) {
        if (age < 18)
            throw new ArithmeticException("The age is less than 18");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        try {
            calAge(2);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
