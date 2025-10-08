package com.tnsif.task7;

public class Wrapper {

	    public static void main(String[] args) {
	        // Primitive types
	        int num = 10;
	        double price = 99.99;
	        char grade = 'A';
	        boolean isPassed = true;

	        // Wrapping primitives into objects (Boxing)
	        Integer numObj = Integer.valueOf(num);
	        Double priceObj = Double.valueOf(price);
	        Character gradeObj = Character.valueOf(grade);
	        Boolean isPassedObj = Boolean.valueOf(isPassed);

	        // Displaying wrapper objects
	        System.out.println("Integer object: " + numObj);
	        System.out.println("Double object: " + priceObj);
	        System.out.println("Character object: " + gradeObj);
	        System.out.println("Boolean object: " + isPassedObj);

	        // Unwrapping objects back to primitives (Unboxing)
	        int newNum = numObj.intValue();
	        double newPrice = priceObj.doubleValue();
	        char newGrade = gradeObj.charValue();
	        boolean newStatus = isPassedObj.booleanValue();

	        // Displaying unboxed values
	        System.out.println("Unboxed int: " + newNum);
	        System.out.println("Unboxed double: " + newPrice);
	        System.out.println("Unboxed char: " + newGrade);
	        System.out.println("Unboxed boolean: " + newStatus);
	    }
	}



