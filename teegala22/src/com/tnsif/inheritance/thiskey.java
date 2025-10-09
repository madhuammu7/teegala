package com.tnsif.inheritance;

public class thiskey {

    static class Hello {
        int x = 20;

        public void demo() {
            int x = 30;
            System.out.println(x);       // local variable
            System.out.println(this.x);  // instance variable
        }
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.demo();
    }
}
