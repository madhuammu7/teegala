package com.tnsif.streamapis;

public class productjava {

    // Instance variables
    int id;
    String name;
    float price;

    // Default constructor
    public productjava() {
        // Default values can be set here if needed
    }

    // Parameterized constructor
    public productjava(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        productjava product = new productjava(101, "Laptop", 59999.99f);
        product.display();
    }
}
