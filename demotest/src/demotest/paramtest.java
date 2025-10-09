package demotest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class paramtest {

    @ParameterizedTest
    @ValueSource(strings = {"cali", "bali"})
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
    }
}
