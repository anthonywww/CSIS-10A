package com.github.anthonywww.lab3;

/**
 * Date and printing via multiple methods
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 1/31/2018
 */
public class Date {

	public static void main(String[] args) {
		// Declare variables
		String day, month;
		int date, year;

		// Assign values
		day = "Thursday";
		month = "August";
		date = 29;
		year = 2013;

		// Print dates
		printAmerican(day, month, date, year);
		printEuropean(day, date, month, year);

		// Initialize variables
		int h = 11;
		int m = 59;

		// Call printTime
		printTime(h, m);
		
		// Part 3
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}

	private static void printAmerican(String day, String month, int date, int year) {
		System.out.printf("%s, %s %d, %d\n", day, month, date, year);
	}

	private static void printEuropean(String day, int date, String month, int year) {
		System.out.printf("%s %d %s, %d\n", day, date, month, year);
	}

	private static void printTime(int hour, int minute) {
		System.out.printf("%d:%d\n", hour, minute);
	}

	// Part 2 Stack Diagram
	// main:
	// printTime: hour=11, minute=59
	// 
	
	private static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}

	private static void baffle() {
		System.out.print("wug");
		ping();
	}

	private static void ping() {
		System.out.println(".");
	}
	
	// Part 3 Stack Diagram
	// main:
	// zoop:
	// baffle:
	// baffle:
	// 
}
