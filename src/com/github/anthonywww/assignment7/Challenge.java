package com.github.anthonywww.assignment7;

import java.util.Scanner;

/**
 * Square roots
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/05/2018
 */
public class Challenge {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double input;
		
		System.out.println("Square root of:");
		
		do {
			input = keyboard.nextDouble();
		} while (input < 1);
		
		System.out.printf("Square root of %.2f is %.2f", input, squareRoot(input));
		
		keyboard.close();
	}
	
	private static double squareRoot(double num) {
		num = Math.abs(num);
		double lastguess = 1;
		double nextguess = 0;
		
		while (Math.abs(num/lastguess - lastguess) >= 0.005) {
			nextguess = 0.5 * (lastguess + (num/lastguess));
			//System.err.println("(0.5*" + lastguess + "+(" + num + "/" + lastguess + ")) = " + nextguess);
			lastguess = nextguess;
		}
		
		return nextguess;
	}
	
}
