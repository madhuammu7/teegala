package com.tnsif.collections;

//Generic class definition
class Generic1<T> {
 private T data;

 public void setData(T data) {
     this.data = data;
 }

 public T getData() {
     return data;
 }
}

//Main class
public class geneticdemo {
 public static void main(String[] args) {
     Generic1<Integer> g = new Generic1<>();
     g.setData(201);
     System.out.println(g.getData());

     Generic1<String> g1 = new Generic1<>();
     g1.setData("TNS");
     System.out.println(g1.getData());
 }
}
