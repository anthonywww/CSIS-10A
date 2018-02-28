package com.github.anthonywww.assignment6;

/**
 * CodingBat examples
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/27/2018
 */
public class CodingBat {

	public static void main(String[] args) {

		// 1
		// Write the method sleepIn below main.
		// test by running this segment
		System.out.println("sleepIn(false, false) =" + sleepIn(false, false) + " should be true");
		System.out.println("sleepIn(true, false) =" + sleepIn(true, false) + " should be false");
		System.out.println("sleepIn(false, true) =" + sleepIn(false, true) + " should be true");
		System.out.println("sleepIn(true, true) =" + sleepIn(true, true) + " should be true");

		// 2
		// We have two monkeys, a and b. We are in trouble if they
		// are both smiling or if neither of them is smiling.
		// Write the method monkeyTrouble below main. The first
		// parameter, aSmile, is true if monkey a is smiling.
		// The method should return true if we are in trouble.
		// test by running this segment
		System.out.println("monkeyTrouble(false, false) =" + monkeyTrouble(false, false) + " should be true");
		System.out.println("monkeyTrouble(true, false) =" + monkeyTrouble(true, false) + " should be false");
		System.out.println("monkeyTrouble(false, true) =" + monkeyTrouble(false, true) + " should be false");
		System.out.println("monkeyTrouble(true, true) =" + monkeyTrouble(true, true) + " should be true");

		// 3
		// Write a method where indicated below main named sumDouble.
		// Given two int values, it returns their sum.
		// Unless the two values are the same,
		// then return double their sum. Test your method below.
		System.out.println("sumDouble(1,2) =" + sumDouble(1, 2) + " should be 3");
		System.out.println("sumDouble(3,2) =" + sumDouble(3, 2) + " should be 5");
		System.out.println("sumDouble(2,2) =" + sumDouble(2, 2) + " should be 8");
		System.out.println("sumDouble(3,3) =" + sumDouble(3, 3) + " should be 12");

		// 4
		// Write a method where indicated below main named cigarParty.
		// Test your method by running the statements below.
		System.out.println("cigarParty(30, false) =" + cigarParty(30, false) + " should be false");
		System.out.println("cigarParty(50, false) =" + cigarParty(50, false) + " should be true");
		System.out.println("cigarParty(70, true) =" + cigarParty(70, true) + " should be true");
		System.out.println("cigarParty(80, false) =" + cigarParty(80, false) + " should be false");

		// 5
		// Write a method below main named caughtSpeeding.
		// Test your method here.
		System.out.println("caughtSpeeding(60,false) =" + caughtSpeeding(60, false) + " should be 0");
		System.out.println("caughtSpeeding(65,false) =" + caughtSpeeding(65, false) + " should be 1");
		System.out.println("caughtSpeeding(65,true) =" + caughtSpeeding(65, true) + " should be 0");
		System.out.println("caughtSpeeding(85,true) =" + caughtSpeeding(85, true) + " should be 1");
		System.out.println("caughtSpeeding(81,false) =" + caughtSpeeding(81, false) + " should be 2");

		// 6
		// Write a method below main named teenSum.
		// Given two int values, it returns their sum.
		// However, "teen" values in the range 13..19 inclusive,
		// are extra lucky. So if either value is a teen,
		// just return 19. Test your method below.
		System.out.println("teenSum(3,4) =" + teenSum(3, 4) + " should be 7");
		System.out.println("teenSum(10,13) =" + teenSum(10, 13) + " should be 19");
		System.out.println("teenSum(13,2) =" + teenSum(13, 2) + " should be 19");
		System.out.println("teenSum(6,7) =" + teenSum(6, 7) + " should be 13");
		System.out.println("teenSum(2,20) =" + teenSum(2, 20) + " should be 22");

		// 7
		// Write a method below main named factorial.
		// Use recursion. See hint on CodingBat for this problem
		// Test your method below.
		System.out.println("factorial(1) =" + factorial(1) + " should be 1");
		System.out.println("factorial(2) =" + factorial(2) + " should be 2");
		System.out.println("factorial(4) =" + factorial(4) + " should be 24");
		System.out.println("factorial(10) =" + factorial(10) + " should be 3628800");

		// 8
		// Write a method below named sumDigits.
		System.out.println("sumDigits(126) =" + sumDigits(126) + " should be 9");
		System.out.println("sumDigits(49) =" + sumDigits(49) + " should be 13");
		System.out.println("sumDigits(12) =" + sumDigits(12) + " should be 3");
		System.out.println("sumDigits(126) =" + sumDigits(126) + " should be 9");
		System.out.println("sumDigits(0) =" + sumDigits(0) + " should be 0");
		System.out.println("sumDigits(11111) =" + sumDigits(11111) + " should be 5");

		// 9
		// Write a method below named blackjack.
		System.out.println("blackjack(19,21) =" + blackjack(19, 21) + " should be 21");
		System.out.println("blackjack(21,19) =" + blackjack(21, 19) + " should be 21");
		System.out.println("blackjack(19,21) =" + blackjack(19, 21) + " should be 21");
		System.out.println("blackjack(19,22) =" + blackjack(19, 22) + " should be 19");
		System.out.println("blackjack(19,21) =" + blackjack(19, 21) + " should be 21");
		System.out.println("blackjack(22,22) =" + blackjack(22, 22) + " should be 0");
		System.out.println("blackjack(22,50) =" + blackjack(22, 50) + " should be 0");
		System.out.println("blackjack(9,6) =" + blackjack(9, 6) + " should be 9");

	}

	/*
	 * 1) sleepIn The parameter weekday is true if it is a weekday, and the
	 * parameter vacation is true if we are on vacation. We sleep in if it is
	 * not a weekday or we're on vacation. Return true if we sleep in.
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return (!weekday || vacation);
	}

	/*
	 * 2) monkeyTrouble We have two monkeys, a and b, and the parameters aSmile
	 * and bSmile indicate if each is smiling. We are in trouble if they are
	 * both smiling or if neither of them is smiling. Return true if we are in
	 * trouble.
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile ? true : (!aSmile && !bSmile ? true : false));
	}

	/*
	 * 3) sumDouble Given two int values, return their sum. Unless the two
	 * values are the same, then return double their sum.
	 * 
	 * write your sumDouble method here:
	 */
	public static int sumDouble(int a, int b) {
		return (a == b ? (2*(a+b)) : a + b);
	}

	/*
	 * 4) cigarParty When squirrels get together for a party, they like to have
	 * cigars. A squirrel party is successful when the number of cigars is
	 * between 40 and 60, inclusive. Unless it is the weekend, in which case
	 * there is no upper bound on the number of cigars. Return true if the party
	 * with the given values is successful, or false otherwise. See assignment
	 * handout for hints. write your cigarParty method here:
	 */
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		return (cigars >= 40 ? (isWeekend ? true : (cigars <= 60 ? true : false)) : false);
	}

	/*
	 * 5) caughtSpeeding You are driving a little too fast, and a police officer
	 * stops you. Write code to compute the result, encoded as an int value:
	 * 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the
	 * result is 0. If speed is between 61 and 80 inclusive, the result is 1. If
	 * speed is 81 or more, the result is 2. Unless it is your birthday -- on
	 * that day, your speed can be 5 higher in all cases.
	 * 
	 * write your caughtSpeeding method here
	 */
	public static int caughtSpeeding(int speed, boolean isBirthday) {
//		final int NO_TICKET = 0;
//		final int SMALL_TICKET = 1;
//		final int BIG_TICKET = 2;
//		final int EXTRA_UPPER_BOUNDS = (isBirthday ? 5 : 0);
		
//		if (speed <= 60 + EXTRA_UPPER_BOUNDS) {
//			return NO_TICKET;
//		} else if (speed <= 80 + EXTRA_UPPER_BOUNDS) {
//			return SMALL_TICKET;
//		} else {
//			return BIG_TICKET;
//		}
		
		return (isBirthday ? (speed <= 65 ? 0 : (speed <= 85 ? 1 : 2)) : (speed <= 60 ? 0 : (speed <= 80 ? 1 : 2)));
	}

	/*
	 * 6) teenSum Given 2 ints, a and b, return their sum. However, "teen"
	 * values in the range 13..19 inclusive, are extra lucky. So if either value
	 * is a teen, just return 19.
	 * 
	 * write your teenSum method here
	 */
	public static int teenSum(int a, int b) {
		return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b);
	}

	// 7) write your factorial method here
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	/*
	 * 8) sumDigits Given a non-negative int n, return the sum of its digits
	 * recursively (no loops). Note that mod (%) by 10 yields the rightmost
	 * digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit
	 * (126 / 10 is 12).
	 * 
	 * write your sumDigits method here
	 */
	public static int sumDigits(int n) {
		return (n <= 0 ? 0 : ((n % 10) + sumDigits(n/10)));
	}
	
	
	
	/*
	 * 9) blackjack Given 2 int values greater than 0, return whichever value is
	 * nearest to 21 without going over. Return 0 if they both go over.
	 * 
	 * write your blackjack method here
	 */
	public static int blackjack(int a, int b) {
		return (a == 0 || b == 0 ? 0 : (a > 21 && b > 21 ? 0 : ((21.0F / a > 21.0F / b) ? b : a)));
	}
	
	

}
