package com.github.anthonywww.lab4;

/**
 * Recursion and stack diagram example
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/06/2018
 */
public class ZZub {

	public static void main(String[] args) {
		System.out.println("Hello");
		nLines(4);
		System.out.println("world");
	}
	
	public static void nLines(int n) {
		if (n > 0) {
			System.out.println("");
			nLines(n - 1);
		}
	}
	
	// Stack Diagram
	// 
	// main: 
	// nLines: n=4
	// nLines: n=3
	// nLines: n=2
	// nLines: n=1
	// nLines: n=0

}
