package com.tnsif.task4;

public class constructorover {

    String title;
    String author;
    double price;

    // Default constructor
    () {
        title = "Unknown";
        author = "Anonymous";
        price = 0.0;
    }

    // Constructor with one parameter
    (String title) {
        this.title = title;
        author = "Anonymous";
        price = 0.0;
    }

    // Constructor with two parameters
    k(String title, String author) {
        this.title = title;
        this.author = author;
        price = 0.0;
    }

    // Constructor with all parameters
    (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        Book b3 = new Book("Python Essentials", "Guido");
        Book b4 = new Book("C++ Mastery", "Bjarne", 499.99);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
