package com.tnsif.exceptions;

public class multiplecatches {

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("This is Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("This is Null Pointer Exception");
        }
    }
}


