package com.tnsif.task5;

//Define the Student class
class Student {
 // Private fields
 private String name;
 private int rollNumber;

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter for rollNumber
 public int getRollNumber() {
     return rollNumber;
 }

 // Setter for rollNumber
 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }
}

//Main class to test the Student class
public class gettersetter {
 public static void main(String[] args) {
     // Create a Student object
     Student student = new Student();

     // Set values using setters
     student.setName("madhavi");
     student.setRollNumber(1703);

     // Get values using getters
     System.out.println("Student Name: " + student.getName());
     System.out.println("Roll Number: " + student.getRollNumber());
 }
}
