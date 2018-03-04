package com.github.anthonywww.lab7;

import java.util.Scanner;

/**
 * "Dr. Kow's Hamburger Palace"
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/3/2018
 */
public class Sandwich {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Loop 5 times
		for (int i=0; i<5; i++) {
			if (i != 0) {
				System.out.println();
				System.out.println("Next customer!");
				System.out.println();
			}
			
			// Begin
			burger();
			
			
			// Check for more customers
			int customers;
			
			do {
				System.out.println("Are there any more customers? [1 = Yes] [0 = No]");
				customers = keyboard.nextInt();
			} while (customers != 0 && customers != 1);
			
			if (customers == 0) {
				break;
			}
		}
		
		// Clean up!
		keyboard.close();
	}
	
	private static void burger() {
		
		printSign();
		System.out.println();
		
		int lettuce;
		int tomatoes;
		
		do {
			System.out.println("How many layers of lettuce do you want?");
			lettuce = keyboard.nextInt();
		} while (lettuce < 0);
		
		do {
			System.out.println("How many layers of tomatoes do you want?");
			tomatoes = keyboard.nextInt();
		} while (tomatoes < 0);
		
		System.out.println("Here's your sandwich:");
		System.out.println();
		System.out.println("(_________)");
		
		
//		while (lettuce > 0) {
//			System.out.println(" ~~~~~~~~~");
//			lettuce -= 1;
//		}
		
//		while (tomatoes > 0) {
//		System.out.println(" [  ] [  ]");
//		tomatoes -= 1;
//	}
		
		for (int i=0; i<lettuce; i++) {
			System.out.println(" ~~~~~~~~~");
		}
		
		for (int i=0; i<tomatoes; i++) {
			System.out.println(" [  ] [  ]");
		}
		
		System.out.println(" *********");
		System.out.println("(_________)");
		
	}
	
	private static void printSign() {
		final StringBuilder sb = new StringBuilder();
		final String title = "Prof. Segal's Hamburger Palace";
		final char character = '*';
		
		for (int i=0;i<12;i++) {
			if (i == 0) {
				for (int j=0;j<title.length()+4;j++) {
					sb.append(character);
				}
				sb.append('\n');
			}
			
			if (i == 6) {
				sb.append(character).append(' ').append(title).append(' ').append(character).append('\n');
			} else {
				sb.append(character);
				for (int j=0;j<title.length()+2;j++) {
					sb.append(' ');
				}
				sb.append(character).append('\n');
			}
			
			if (i == 11) {
				for (int j=0;j<title.length()+4;j++) {
					sb.append(character);
				}
				sb.append('\n');
			}
		}
		
		System.out.println(sb.toString());
	}
	
	
	
}
