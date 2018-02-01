package com.github.anthonywww.assignment3;

/**
 * Quadratic equation
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/1/2018
 */
public class EquationSolver {

	public static void main(String[] args) {
		quadratic(1.0, -6.0, 8.0);
		quadratic(1.0, -4.0, -21.0);
		quadratic(1.0, 6.0, -280.0);
	}
	
	/**
	 * Quadratic method
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(double a, double b, double c) {
		double x1 = (-b + Math.sqrt((b*b) - 4 * a * c)) / (2 * a);
		double x2 = (-b - Math.sqrt((b*b) - 4 * a * c)) / (2 * a);
		System.out.printf("a: %.2f b: %.2f c: %.2f x1: %.2f, x2: %.2f\n", a, b, c, x1, x2);
	}
	
	
	
}