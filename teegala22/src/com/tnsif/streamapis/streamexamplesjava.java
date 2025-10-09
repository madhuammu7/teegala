package com.tnsif.streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Define the Product class
class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

// Main class
public class streamexamplesjava {

    public static void main(String[] args) {

        List<Product> pl = new ArrayList<>();

        pl.add(new Product(1, "hp", 25000f));
        pl.add(new Product(2, "Dell", 30000f));
        pl.add(new Product(3, "Apple", 95000f));
        pl.add(new Product(4, "Lenovo", 15000f));

        // Filter products with price > 30000 and collect their prices
        List<Float> pl2 = pl.stream()
                .filter(p -> p.price > 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(pl2);
    }
}
