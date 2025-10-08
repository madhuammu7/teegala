package com.tnsif.task4;

// Final class cannot be extended
final class Constants {
    // Final variable (constant value)
    final int MAX_STUDENTS = 50;

    void showLimit() {
        System.out.println("Maximum allowed students: " + MAX_STUDENTS);
    }
}

// Regular class
class School {
    // Final method cannot be overridden
    final void schoolInfo() {
        System.out.println("This is a government school.");
    }
}

public class Final {
    public static void main(String[] args) {
        Constants obj = new Constants();
        obj.showLimit();

        School s = new School();
        s.schoolInfo();
    }
}
