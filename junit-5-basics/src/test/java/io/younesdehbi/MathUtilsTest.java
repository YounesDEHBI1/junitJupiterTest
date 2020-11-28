package io.younesdehbi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	
	@Test
	void testDivide() {
		// Get our class instance
		MathUtils mathUtils = new MathUtils();
		
		// Dividing 1 by 0 so we get an exception
		//mathUtils.divide(1, 0);
		
		// Asserting exceptions with assertThrows
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
		//assertThrows(NullPointerException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}
}
