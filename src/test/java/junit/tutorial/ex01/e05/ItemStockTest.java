package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	@BeforeEach
	void syoki() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item(null, 0);

	}

	ItemStock itemStock = new ItemStock();
	Item item = new Item(null, 0);
	
	@DisplayName("初期状態で、getNumで０が取得できる")
	@Test
	void test() {
		
		int result = itemStock.getNum(item);
		assertEquals(0, result, "0が取得される");
	}

	@DisplayName("初期状態で、addでItemを追加するとgetNumで１が取得できる")
	@Test
	void test2() {
	
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result, "1が取得される");
	}

	@DisplayName("Itemが１つ追加されている状態で、getNumで１が取得できる")
	@Test
	void test3() {
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result, "1が取得される");
	}

	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる")
	@Test
	void test4() {

		itemStock.add(item);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(2, result, "2が取得される");

	}

	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる")
	@Test
	void test5() {
		
		itemStock.add(item);

		Item item2 = new Item("CD", 500);
		itemStock.add(item2);
		int result = itemStock.getNum(item);

		assertEquals(1, result, "1が取得される");

	}
}
