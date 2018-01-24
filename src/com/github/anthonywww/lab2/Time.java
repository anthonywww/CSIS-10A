package com.github.anthonywww.lab2;

import java.util.Calendar;

/**
 * Testing string concatenation part 2
 *
 * @author Anthony Waldsmith
 * @version 1/24/2018
 */
public class Time {

	public static void main(String[] args) {
		int hour;
		int minute;
		int second;

		hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		minute = Calendar.getInstance().get(Calendar.MINUTE);
		second = Calendar.getInstance().get(Calendar.SECOND);

		second += hour * 24 * 60; // hours to seconds
		second += minute * 60; // minutes to seconds

		System.out.println(second);

	}

}

/* Part B
 * Player A: Anthony Waldsmith
 * Player B: Anthony Waldsmith
 * 
 * Round 1A: Anthony 1pt (subtracting assignment operator instead of adding assignment operator)
 * Round 1B: Anthony 1pt (removed semi-colon at the end of assigning the minutes to seconds statement)
 * Round 2A: Anthony 1pt (misspelled second)
 * Round 2B: Anthony 2pt (set the variable type hour to String)
 * Round 3A: Anthony 3pt (changed the literal value 60 to 35 for minute to second)
 * Round 3A: Anthony 1pt (removed closing class curly-brace)
 */