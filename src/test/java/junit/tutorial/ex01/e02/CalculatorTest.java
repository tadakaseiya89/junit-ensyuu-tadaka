package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@DisplayName("数字テスト")
	@Test
	void test() {
		Calculator calc = new Calculator();
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(3, 0));
		assertEquals(exception.getMessage(), "divide by zero.");
	};
	
}
