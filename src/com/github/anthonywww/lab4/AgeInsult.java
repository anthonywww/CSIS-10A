package com.github.anthonywww.lab4;

import java.util.Scanner;

/**
 * Fix this example of insulting people according to their age. (I didn't write this! Just fixed the logic behind it)
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/05/2018
 */
public class AgeInsult {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How old are you?");

		int age = keyboard.nextInt();
		
		// You never closed the scanner! Leaky!
		keyboard.close();
		
		// Exactly one of these 4 main blocks will be executed.
		if (age <= 3) {
			System.out.println("Too young to know any better.");
		} else if (age < 10) {
			System.out.println("Not ready for prime time.");
		} else if (age < 18) {
			System.out.println("Grow up.");
		} else {
			System.out.println("Get a job!");
		}

		// if statement without "else if" or even an "else".
		// this will either execute or not execute depending on age
		if (age > 120) {
			System.out.println("Way too old!  You are probably lying.");
		}
	}
	
	
}
