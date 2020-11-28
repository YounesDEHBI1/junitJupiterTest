package io.younesdehbi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		// Get our class instance
		MathUtils mathUtils = new MathUtils();
		// Set expected result
		int expected = 1;
		// Call method to get actual result
		int actual = mathUtils.add(1, 1);
		// Hey JUnit, I am asserting that "expected" & "actual" are the same
		assertEquals(expected, actual);
	}

}
