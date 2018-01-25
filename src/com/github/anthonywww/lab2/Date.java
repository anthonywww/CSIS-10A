package com.github.anthonywww.lab2;

/**
 * Testing string concatenation
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 1/24/2018
 */
public class Date {
	
	public static void main(String[] args) {
		int date = 23;
		int year = 2018;
		String day = "Tuesday";
		String month = "January";
		
		System.out.println("American format:");
		System.out.printf("%s, %s %d, %d\n", day, month, date, year);
		System.out.println("European format:");
		System.out.printf("%s %d %s, %d\n", day, date, month, year);
	}

	
}
