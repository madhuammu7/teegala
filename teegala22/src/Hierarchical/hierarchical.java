package Hierarchical;

public class hierarchical {

    static class A {
        int a = 10;
        int b = 20;
    }

    static class Add extends A {
        public void Addition() {
            System.out.println("This is Add: " + (a + b));
        }
    }

    static class Sub extends A {
        public void Subtraction() {
            System.out.println("This is Sub: " + (a - b));
        }
    }

    static class Mul extends A {
        public void Multiplication() {
            System.out.println("This is Mul: " + (a * b));
        }
    }

    public static void main(String[] args) {
        Add addObj = new Add();
        Sub subObj = new Sub();
        Mul mulObj = new Mul();

        addObj.Addition();
        subObj.Subtraction();
        mulObj.Multiplication();
    }
}
