package com.tnsif.task3;
public class superkeyword {

	// Base class
	class Base {
	    public void hello() {
	        System.out.println("This is Base");
	    }
	}

	// Derived class that extends Base
	class Derived extends Base {
	    @Override
	    public void hello() {
	        System.out.println("This is Derived");
	    }
	    
	    // A new method to show the use of 'super'
	    public void callParentHello() {
	        super.hello(); // Calls the 'hello' method from the Base class
	    }
	}

	// Main class to run the program
	public class SuperKeyword {
	    public static void main(String[] args) {
	        Derived d = new Derived();
	        d.hello(); // Calls the overridden method in the Derived class
	        d.callParentHello(); // Calls the method that uses 'super' to access the Base class method
	    }
	}
}

	