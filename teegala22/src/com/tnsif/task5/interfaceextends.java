package com.tnsif.task5;


//Base interface
interface Animal {
 void eat();
}

//Extended interface
interface Dog extends Animal {
 void bark();
}

//Class implementing the extended interface
class Labrador implements Dog {
 public void eat() {
     System.out.println("Labrador is eating.");
 }

 public void bark() {
     System.out.println("Labrador is barking.");
 }
}

//Main class to test the implementation
public class interfaceextends {
 public static void main(String[] args) {
     Labrador myDog = new Labrador();
     myDog.eat();   // Output: Labrador is eating.
     myDog.bark();  // Output: Labrador is barking.
 }
}
