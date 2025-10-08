package com.tnsif.task2;

import java.util.Scanner;

public class evencheck 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        sc.close();
    }
}
