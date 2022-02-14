package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	@DisplayName("１６を指定してcreateFizzBuzzListメソッドを実行すると「1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16」が取得できる")
	@Test
	void test() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> result1 = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
				"Fizz", "13", "14", "FizzBuzz", "16");
		List<String> result2 = fizzBuzz.createFizzBuzzList(16);

		assertEquals(result1, result2, "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16になる");

	}

}
