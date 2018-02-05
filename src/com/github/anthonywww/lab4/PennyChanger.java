package com.github.anthonywww.lab4;

/**
 * Count money in reasonable amounts
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/05/2018
 */
public class PennyChanger {

	public static void main(String[] args) {
		int pennies, leftover_pennies, quarters, dimes, nickels;

		pennies = 116;

		System.out.println("We are going to convert " + pennies + " cents into");
		System.out.println("quarters, dimes, nickels, and leftover pennies...\n\n");

		// find how many quarters are in pennies
		quarters = 0;
		quarters = pennies / 25;
		// find how many pennies are leftover after removing the quarters
		leftover_pennies = 0;
		leftover_pennies = pennies % 25;

		// find how many dimes are in leftover_pennies
		dimes = 0;
		dimes = leftover_pennies / 10;
		leftover_pennies = pennies % 10;

		// find how many nickels are in leftover_pennies
		nickels = 0;
		nickels = leftover_pennies / 5;
		leftover_pennies = pennies % 5;

		System.out.println("You now have " + quarters + " quarters, " + dimes + " dimes, ");
		System.out.println(nickels + " nickels, " + leftover_pennies + " pennies. Same amount? ");

	}

}
