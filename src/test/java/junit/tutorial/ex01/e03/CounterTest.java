package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {
	@DisplayName("１回表示テスト")
	@BeforeEach
	@Test
	void test1() {
		Counter counter = new Counter();
		int result1 = counter.increment();
		assertEquals(1, result1, "１と表示されます");
	}

	@DisplayName("2回表示テスト")
	@Test
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		int result2 = counter.increment();
		for (int i = 1; i < 2; i++) {
			counter.increment();
		}
		assertEquals(2, result2, "2と表示されます");
	}

	@DisplayName("51回表示テスト")
	@Test
	void test3() {
		Counter counter = new Counter();
		counter.increment();
		int result3 = counter.increment();
		for (int i = 1; i < 50; i++) {
			counter.increment();
		}
		assertEquals(51, result3, "51と表示されます");
	}
}