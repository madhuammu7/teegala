package com.tnsif.collections;

import java.util.ArrayList;

public class arrayone {

    public static void main(String[] args) {
        ArrayList<Object> ai = new ArrayList<Object>();

        ai.add(101);
        ai.add("Hello madhu");
        ai.add(45.4);
        System.out.println(ai);

        ai.remove(1);
        System.out.println(ai);

        ai.add(null);
        ai.add(null);
        System.out.println(ai);

        System.out.println(ai.get(1));

        // Optional: comment out this line to avoid recursion when printing
        // ai.add(ai); 
    }
}

