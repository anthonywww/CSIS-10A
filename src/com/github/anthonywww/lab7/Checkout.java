package com.github.anthonywww.lab7;

import java.util.Scanner;

/**
 * "Dr. Kow's Hamburger Palace"
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/3/2018
 */
public class Checkout {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		checkout();
		
	}
	
	private static void checkout() {
		
		System.out.println("KowMart express self-checkout (10 item limit)");
		int items = 0;
		int totalItems = 0;
		double cost = 0;
		
		do {
			System.out.println("How many items (1-10)?");
			items = keyboard.nextInt();
		} while (items <= 0 || items > 10);
		
		totalItems = items;
		
		do {
			System.out.println((cost == 0.0 ? "Cost of first item?" : "Cost of next item?"));
			cost += keyboard.nextDouble();
			items -= 1;
		} while (items > 0);
		
		
		boolean bag = false;
		
		do {
			System.out.println("Would you like a bag with that? (costs .05 extra if you have 3 or less items) [yes/no]");
			String input = keyboard.next();
			if (input.equalsIgnoreCase("yes")) {
				bag = true;
				break;
			}
			if (input.equalsIgnoreCase("no")) {
				bag = false;
				break;
			}
		} while (true);
		
		if (bag) {
			if (totalItems <= 3)  {
				cost += 0.05;
			}
		}
		
		// Add sales tax
		cost *= 1.06;
		
		System.out.printf("Your total with 6 percent sales tax is $%1.2f\n", cost);
	}
	
	
	
	
	
}
