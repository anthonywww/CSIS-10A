package com.github.anthonywww.lab4;

/**
 * Recursive method call example
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/05/2018
 */
public class Recursion {

	public static void countdown(int n) {
		
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
		
	}

	public static void main(String[] args) {
		countdown(4);
	}
}
