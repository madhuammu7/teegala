package com.tnsif.task4;


public class overloading {

public static class MethodOverloadingDemo {

// Overloaded methods with different parameter types

void display(int a, double b) {

System.out.println("Method with int and double:"+ a +","+ b); 
}


void display(double a, int b) {


System.out.println("Method with double and int:"+ a +","+ b);
}


void display(String name, int age) {



System.out.println("Name:" + name +"Age:" + age);
}

void display(int age, String name) {

System.out.println("Age:"+ age +", Name:" +name);
}

public static void main(String[] args) {

MethodOverloadingDemo obj= new MethodOverloadingDemo();

obj.display(10, 20.5);
obj.display(15.5, 25);
obj.display("Madhavi", 22);
obj.display(22, "Madhavi");

}
}
}

