package io.younesdehbi;

public class MathUtils {

	/**
	 *  Addition method
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		return a + b;
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
