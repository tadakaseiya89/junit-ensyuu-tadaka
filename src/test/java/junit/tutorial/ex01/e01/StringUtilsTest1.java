package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest1 {

	@DisplayName("「aaa」を入力すると、「aaa」が取得できる")
	@Test
	void test() {
		String result1 = junit.tutorial.ex01.e01.StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result1, "aaaと返ってきます");
	}

	@DisplayName("「HelloWorld」を入力すると、「hello_world」が取得できる")
	@Test
	void test2() {
		String result2 = junit.tutorial.ex01.e01.StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result2, "hello_worldと返ってきます");
	}

	@DisplayName("「practiceJunit」を入力すると、「practice_junit」が取得できる")
	@Test
	void test3() {
		String result3 = junit.tutorial.ex01.e01.StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result3, "practice_junitと返ってきます");
	}

}
