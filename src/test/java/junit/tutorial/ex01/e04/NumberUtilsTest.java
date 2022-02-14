package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	@DisplayName("trueテスト")
	@Test
	void test1() {
		boolean result1 = NumberUtils.isEven(10);
		assertEquals(true, result1, "trueです");
	}

	@DisplayName("falseテスト")
	@Test
	void test2() {
		boolean result2 = NumberUtils.isEven(7);
		assertEquals(false, result2, "falseです");
	}

}
