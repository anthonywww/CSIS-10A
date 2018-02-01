package com.github.anthonywww.assignment3;

import java.util.Random;

/**
 * Prints a test average
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/1/2018
 */
public class TestAverage {

	public static void main(String[] args) {
		
		average(randInt(), randInt(), randInt());
		average(randInt(), randInt(), randInt());
		average(randInt(), randInt(), randInt());
		
	}

	/**
	 * Get the average of n test scores
	 * @param scores...
	 */
	public static void average(int... scores) {
		double average = 0.0;
		
		if (scores.length == 0) {
			System.out.println("No test scores!");
			return;
		}
		
		System.out.print("Test scores: ");
		
		// Iterate and add up the scores[]
		for (int i=0; i<scores.length; i++) {
			average += scores[i];
			System.out.printf("%d%s", scores[i], (i < scores.length-1 ? ", " : " "));
		}
		
		// Divide by the number of scores entered
		average /= (double) scores.length;
		
		System.out.printf("which averages out to %.3f\n", average);
	}
	
	/**
	 * Generates and returns a random integer
	 * @return randomInt
	 */
	public static int randInt() {
		return new Random().nextInt(100);
	}

}