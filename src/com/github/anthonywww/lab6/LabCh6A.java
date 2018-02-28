package com.github.anthonywww.lab6;

/**
 * Test Bug with the library GridWorld
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/26/2018
 */
public class LabCh6A {

	public static void main(String[] args) {

		// #1
		// Write the isDivisible method below main
		// Test the isDivisible method by running this segment

		System.out.println("Is 8 divisible by 3? " + isDivisible(8, 3));
		System.out.println("Is 9 divisible by 3? " + isDivisible(9, 3));
		System.out.println("Is 200 divisible by 14? " + isDivisible(200, 14));

		// #2
		System.out.println("1*2 + 3 = " + multadd(1.0, 2.0, 3.0));
		System.out.println("10*3 + 6 = " + multadd(10.0, 3.0, 6.0));
		System.out.println("9*4 + 3.3 = " + multadd(9.0, 4.0, 3.3));

		// #3
		if (isTriangle(4, 1, 2)) {
			System.out.println("4,1,2 is a triangle");
		} else {
			System.out.println("4,1,2 is NOT a triangle");
		}

		if (isTriangle(14, 10, 12)) {
			System.out.println("14,10,12 is a triangle");
		} else {
			System.out.println("14,10,12 is NOT a triangle");
		}
		
		if (isTriangle(14, 10, 12)) {
			System.out.println("14,10,12 is a triangle");
		} else {
			System.out.println("14,10,12 is NOT a triangle");
		}
		
		if (isTriangle(6, 3, 1)) {
			System.out.println("6,3,1 is a triangle");
		} else {
			System.out.println("6,3,1 is NOT a triangle");
		}

		if (isTriangle(4, 0, 9)) {
			System.out.println("4,0,9 is a triangle");
		} else {
			System.out.println("4,0,9 is NOT a triangle");
		}
		
		if (isTriangle(1, 1, 7)) {
			System.out.println("1,1,7 is a triangle");
		} else {
			System.out.println("1,1,7 is NOT a triangle");
		}
		
		// add another three test cases here
	}
	
	
	private static boolean isDivisible(int n, int m) {
		return (n % m) == 0;
	}
	
	private static double multadd(double a, double b, double c) {
		return ((a * b) + c);
	}
	
	private static boolean isTriangle(int a, int b, int c) {
		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			return false;
		}
		return true;
	}
	

}
