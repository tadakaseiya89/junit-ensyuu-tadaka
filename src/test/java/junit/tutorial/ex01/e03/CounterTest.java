package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {
	@DisplayName("初期状態で、incrementメソッドを実行すると１が取得できる")
	@Test
	void test1() {
		Counter counter = new Counter();
		int result1 = counter.increment();
		assertEquals(1, result1, "１と表示されます");
	}

	@DisplayName("incrementメソッドを１回実行した状態で、incrementメソッドを実行すると２が取得できる")
	@Test
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		int result2 = counter.increment();
		assertEquals(2, result2, "2と表示されます");
	}

	@DisplayName("incrementメソッドを50回実行した状態で、incrementメソッドを実行すると５１が取得できる")
	@Test
	void test3() {
		Counter counter = new Counter();
		for (int i = 0; i < 50; i++) {
			counter.increment();

		}
		int result3 = counter.increment();
		assertEquals(51, result3, "51と表示されます");
	}
}