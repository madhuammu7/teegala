package com.tnsif.collections;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        
        al.add(101);
        al.add("riya");
        al.add(89.3); 
        System.out.println(al);
        
        al.remove(1);
        System.out.println(al);
        
        System.out.println(al.get(0));
        
        al.add("madhu");
        al.add(null);
        al.add(17);
        
        System.out.println(al);
    }
}
