package com.github.anthonywww.assignment7;

import java.util.Scanner;

/**
 * Guess a number 0 to 100
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/05/2018
 */
public class Guess {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number = (int) Math.round(100*Math.random());
		int guess;
		
		System.out.println("I've got a number 0 to 100.");
		
		do {
			System.out.println("What's your guess?");
			guess = keyboard.nextInt();
			
			// Break out if it's the number
			if (guess == number) {
				break;
			}
			
			if (guess < number) {
				System.out.println("Guess higher.");
			} else {
				System.out.println("Guess lower.");
			}
			
		} while (guess != number);
		
		System.out.println("Got it!");
		
		keyboard.close();
	}
	
	
	
	
}
