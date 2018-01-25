package com.github.anthonywww.assignment1;

/**
 * Hello World Java test program
 *
 * @author Anthony Waldsmith
 * @version 1/25/2018
 */
public class MagicTrick {
	
	public static void main(String[] args) {
		
		// Input number
		final int input = 8;
		int magicNumber;
		
		// Square it
		magicNumber = input * input;
		
		// Add original number
		magicNumber += input;
		
		// Divide by original number
		if (input != 0) {
			magicNumber /= input;
		}
		
		// Add a literal value of 17
		magicNumber += 17; 
	
		// Subtract by the original number
		magicNumber -= input;
		
		// Divide by the literal value of 6
		magicNumber /= 6;
		
		// Print result
		System.out.println(magicNumber);
	}
	
	
}
