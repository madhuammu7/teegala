package com.tnsif.task3;


	// Parent class (also known as the base or super class)
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Child class (also known as the derived or sub class)
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	// Main class to run the program
	public class SingleInheritanceDemo {
	    public static void main(String[] args) {
	        // Create an object of the child class
	    	   Dog myDog = new Dog();
	        
	        // The Dog object can access its own method
	        myDog.bark(); 
	        
	        // It can also access the method inherited from the Animal class
	        myDog.eat(); 
	    }
	}
	

