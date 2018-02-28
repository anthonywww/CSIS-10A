package com.github.anthonywww.lab6;

/**
 * Test cases using recursion
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/26/2018
 */
public class LabCh6B {

	public static void main(String[] args) {
		// Type in the definition of the prod method where indicated
		// below main and execute it.
		// Does it perform the way you predicted?
		// Does it behave as expected?
		// Yes.
		System.out.println("prod(1,4) = " + prod(1, 4));
		System.out.println("prod(3,8) = " + prod(3, 8));
		System.out.println("prod(1,1) = " + prod(1, 1));
		System.out.println("prod(1,3) = " + prod(1, 3));

		// (OPTIONAL) We have a triangle made of blocks. The topmost row
		// has 1 block, the next row down has 2 blocks,
		// the next row has 3 blocks, and so on.
		//
		// Define the triangle method below main to compute
		// recursively the total number of blocks in such a triangle
		// with the given number of rows.

		// Test cases:
		System.out.println("triangle(0) = " + triangle(0));
		System.out.println("triangle(1) = " + triangle(1));
		System.out.println("triangle(2) = " + triangle(2));
		System.out.println("triangle(8) = " + triangle(8));
	}
	
	
	/**
	 * Some form of factorial-ish method
	 * @param m
	 * @param n
	 * @return
	 */
	private static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else {
			return n * prod(m, n-1);
		}
	}
	/* Stack Diagram
	 * 
	 * main:
	 * prod: m=1, n=4, recurse=4, result=24; returns 24
	 * prod: m=1, n=3, recurse=3, result=12; returns 12
	 * prod: m=1, n=2, recurse=2, result=6; returns 6
	 * prod: m=1, n=1, recurse=1, result=3; returns
	 */
	
	
	/**
	 * Count "blocks" on each "row" of the triangle
	 * @param num
	 * @return
	 */
	private static int triangle(int num) {
		if (num <= 1) {
			return num;
		} else {
			return num + triangle(num-1);
		}
	}

}