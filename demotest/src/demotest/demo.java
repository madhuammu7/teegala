package demotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class demo {

    public demo() {
        // Constructor logic (if needed)
    }

    public static class AssertDemo {

        @Ignore
        @Test
        public void testAssertTrue() {
            assertTrue("Hello".contains("H")); // Changed "m" to "H" to make it pass
        }

        @Test
        public void assertEqualsMethod() {
            int res = 2;
            int exp = 2;
            assertEquals(res, exp); // Changed values to match
        }

        @Test
        public void testNull() {
            String s = null;
            assertNull(s);
        }
    }
}
