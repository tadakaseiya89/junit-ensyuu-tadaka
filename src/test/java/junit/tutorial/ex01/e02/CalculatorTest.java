package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static final Calculator calc = new Calculator();

	@Test
	void test() {
		int result1 = calc.divide(3, 0);
		assertEquals(calc.divide(result1, result1), result1, "例外");
		System.out.println(result1);
	}

}
