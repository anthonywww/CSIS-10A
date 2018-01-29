package com.github.anthonywww.lab3;

/**
 * Conversion and math examples
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 1/29/2018
 */
public class NumericTypes {

	public static void main(String[] args) {
		
		////////////////// PART 1 ////////////////
		// variable declarations
		int number = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		double average; // arithmetic average

		// Find the average of score1 and score2
		average = (double) (score1 + score2) / number;

		// Print the average with explanatory info
		System.out.println("The average of " + score1 + " and " + score2 + " is " + average);
		System.out.println(); // to leave a blank line

		
		////////////////// PART 2 ///////////////
		double fahrenheit = 212; // boiling temperature in fahrenheit int
		double celsius; // temperature in celsius

		// Convert Fahrenheit temperatures to Celsius
		celsius = (5.0 / 9.0) * (fahrenheit - 32);

		System.out.println(fahrenheit + " deg F = " + celsius + " deg C");
		System.out.println(); // to leave a blank line
		
		
		////////////////////// PART 3 ///////////////////
		double diameter = 1.0; // the diameter of a sphere
		double radius = (diameter / 2.0);
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3); 
		
		
		System.out.printf("The volume of the sphere with a radius of %f is %f\n", radius, volume);
		
		/*
		 * Diameter         Volume (by hand)       Volume (by program)
		 * 
		 * 1                0.52                   0.523599
		 * 3                14.137                 14.137167
		 * 8                268.07                 268.082573
		 */
	}

}
