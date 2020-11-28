package io.younesdehbi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		// Get our class instance
		MathUtils mathUtils = new MathUtils();
		// Set expected result
		int expected = 2;
		// Call method to get actual result
		int actual = mathUtils.add(1, 1);
		// Hey JUnit, I am asserting that "expected" & "actual" are the same
		assertEquals(expected, actual, "The add method should add two number");
	}
	
	@Test
	void testComputeCircleArea() {
		
		// Get our class instance
		MathUtils mathUtils = new MathUtils();
		// Asserting equality
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
	}
}
