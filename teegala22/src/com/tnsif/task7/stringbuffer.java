package com.tnsif.task7;

public class stringbuffer {
	    public static void main(String[] args) {
	        // Using StringBuffer (Thread-safe)
	        StringBuffer sbBuffer = new StringBuffer("Hello");
	        sbBuffer.append(" World");
	        sbBuffer.insert(6, "Java ");
	        sbBuffer.replace(0, 5, "Hi");
	        sbBuffer.delete(3, 8);
	        sbBuffer.reverse();

	        System.out.println("StringBuffer result: " + sbBuffer);

	        // Using StringBuilder (Not thread-safe, but faster)
	        StringBuilder sbBuilder = new StringBuilder("Welcome");
	        sbBuilder.append(" to Java");
	        sbBuilder.insert(8, "Programming ");
	        sbBuilder.replace(0, 7, "Hello");
	        sbBuilder.delete(6, 17);
	        sbBuilder.reverse();

	        System.out.println("StringBuilder result: " + sbBuilder);
	    }
	}



