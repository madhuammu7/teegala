package demotest;

public class paramtest {

	import static org.junit.jupiter.api.Assertions.assertTrue;
	import org.junit.jupiter.params.ParameterizedTest;
	import org.junit.jupiter.params.provider.ValueSource;

	public class paramtest {

	    @ParameterizedTest
	    @ValueSource(strings = {"cali", "bali"})
	    void endswith(String str) {
	        assertTrue(str.endsWith("i"));
	    }
	}
