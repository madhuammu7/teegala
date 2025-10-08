package com.tnsif.collections;

import java.util.*;

public class collections{
    public static void main(String[] args) {
        // ArrayList example
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("carrot");
        fruits.add("banana"); // Allows duplicates

        System.out.println("ArrayList (fruits): " + fruits);

        // HashSet example
        Set<String> uniqueFruits = new HashSet<>(fruits); // Removes duplicates
        System.out.println("HashSet (unique fruits): " + uniqueFruits);

        // HashMap example
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "madhu");
        studentMap.put(102, "ram");
        studentMap.put(103, "pothineni");

        System.out.println("HashMap (Student ID -> Name):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

