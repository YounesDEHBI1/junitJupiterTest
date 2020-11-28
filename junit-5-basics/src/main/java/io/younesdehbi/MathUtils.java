package io.younesdehbi;

public class MathUtils {

	/**
	 * Subtraction method
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Addition method
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	/**
	 * Multiply method
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
	
	/**
	 * Divide method
	 * @param a
	 * @param b
	 * @return
	 */
	public int divide(int a, int b) {
		return a / b;
	}
	
	/**
	 * Compute Circle Area by Test Driven Developpement
	 * @param radius
	 * @return
	 */
	public double computeCircleArea(double radius) {
		// Using Math.PI for precision so we can match the test
		return Math.PI * radius * radius;
	}
}
