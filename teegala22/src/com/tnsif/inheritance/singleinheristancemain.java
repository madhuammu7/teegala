package com.tnsif.inheritance;

//Base class
class A {
 int a = 10;

 public void show() {
     System.out.println("This is class A");
 }
}

//Derived class
class B extends A {
 public void display() {
     System.out.println("This is class B");
 }
}

//Main class
public class singleinheristancemain {
 public static void main(String[] args) {
     B obj = new B();
     obj.display();           // Method from class B
     System.out.println(obj.a); // Inherited variable from class A
     obj.show();              // Inherited method from class A
 }
}
