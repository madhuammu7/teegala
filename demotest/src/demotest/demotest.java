package demotest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class demotest {

    public demotest() {
        // Constructor logic if needed
    }

    public static class Demo {

        @DisplayName("junittesting")
        @RepeatedTest(2)
        public void show() {
            System.out.println("this is show method");
        }

        @Disabled
        @Test
        public void sayHi() {
            System.out.println("this is Hii method");
        }

        @DisplayName("junittesting2")
        @Test
        public void hello() {
            System.out.println("this is hello method");
        }
    }
}
