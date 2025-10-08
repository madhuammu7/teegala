package com.tnsif.collections;

import java.util.*;

public class laptop implements Comparable<laptop> {
    private String brand;
    private int cost;
    private int gen;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", cost=" + cost + ", gen=" + gen + "]";
    }

    // Correct method name
    @Override
    public int compareTo(laptop o) {
        return Integer.compare(this.cost, o.cost);
    }

    // Main method to test
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.setBrand("Dell");
        l1.setCost(55000);
        l1.setGen(11);

        laptop l2 = new laptop();
        l2.setBrand("HP");
        l2.setCost(50000);
        l2.setGen(10);

        List<laptop> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);

        Collections.sort(list);

        for (laptop l : list) {
            System.out.println(l);
        }
    }
}
