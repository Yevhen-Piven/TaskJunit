package ua.com.yevhenpiven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testHelloWorld() {
		assertEquals("olleH ym gib dlrow",Main.reverse("Hello my big world"));;
	}
	@Test
	void testNullString() {
		assertEquals("",Main.reverse(""));;
	}

}
