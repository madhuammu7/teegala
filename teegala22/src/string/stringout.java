package string;

public class stringout {

    public static void main(String[] args) {
        String text = "Hello";

        try {
            // Trying to access index 10, which is out of bounds
            char ch = text.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
