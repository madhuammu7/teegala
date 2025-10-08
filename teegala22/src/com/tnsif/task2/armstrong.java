package com.tnsif.task2;


import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        // Calculate sum of digits raised to the power of number of digits
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if it's an Armstrong number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        sc.close();
    }
}
