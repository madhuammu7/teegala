package com.tnsif.collections;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("ArrayList");
        ArrayList<String> l = new ArrayList<>();
        l.add("hyderabad");
        l.add("chennai");
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        System.out.println(l.get(0));

        // Vector
        System.out.println("Vector");
        Vector<String> v = new Vector<>();
        v.addElement("hyderabad");
        v.addElement("chennai");
        v.addElement("mumbai");
        System.out.println(v);
        v.removeElement("chennai");
        System.out.println(v);
        System.out.println(v.get(0));

        // Stack
        System.out.println("Stack");
        Stack<Object> s = new Stack<>();
        s.push("abc");
        s.push(10);
        s.push(true);
        s.push("abc");
        s.push(null);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);

        // HashSet
        System.out.println("HashSet");
        Set<String> e = new HashSet<>();
        e.add("rahul");
        e.add("priya");
        e.add("sumit");
        System.out.println(e);
        e.remove("priya");
        System.out.println(e);
    }
}
