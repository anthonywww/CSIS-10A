package com.github.anthonywww.assignment4;
import java.util.Scanner;

/**
 * More example drills
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/12/2018
 */
public class Drills {
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int score;

		System.out.print("Enter a test score ");
		score = keyboard.nextInt();

		// ************* Ex A **************************
		// write a simple if statement that says "pass"
		// if score is >= 65, otherwise it says nothing
		System.out.println("A) Conditional Execution");
		if (score >= 64) {
			System.out.println("pass");
		}

		// ************ End Ex A **********************/

		// ************* Ex B **************************
		// Use an if-else statement to choose one of the following:
		// Show "pass" if score is>=65,
		// otherwise show "fail" (use if-else)
		// Test your solution by entering different scores
		System.out.println("B) Alternative Execution");
		if (score >= 64) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// ************ End Ex B **********************/
		// ************* Ex C **************************
		// Study the Lecture 4 slides and then write a
		// chained if-else statement that prints
		// "A" if the variable score is >= 90,
		// "B" if the variable score is >= 80,
		// "C" if the variable score is >= 65,
		// "D" if the variable score is >= 50, or
		// "F" if none of the above are true
		System.out.println("C) Chained Conditionals");
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 65) {
			System.out.println("C");
		} else if (score >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// ************ End Ex C **********************/
		// ************* Ex D **************************
		// Write a mini program in which the user inputs
		// an age and the output states whether or not the
		// person is a teenager. Use nested conditionals
		// -- first check if age is greater than 12
		// -- inside the code block for true,
		// -- check if age is less than 20
		//
		// Print "Hooray! A Teen!" or "sorry :(" depending on age
		//
		// Use the keyboard scanner we've already created to read age
		//
		System.out.println("D) Nested Conditionals");
		
		System.out.print("   What is your age?");
		
		// declare int age and read age from keyboard Scanner
		int age = score = keyboard.nextInt(); 
		
		if (age > 12) {
			if (age < 20) {
				System.out.println("Hooray! A Teen!");
			} else {
				System.out.println("Sorry :(");
			}
		} else {
			System.out.println("Sorry :(");
		}
		
		// ************ End Ex D **********************/
		// ************* Ex E **************************
		// write a void method, paycheck, below main that calculates and prints
		// a worker's paycheck, given the number of hours, and pay rate
		// similar to last weeks drill, but THIS TIME use an if statement to
		// award overtime properly.
		//
		payCheck(40, 7.75); // answer: $310

		payCheck(20, 9.25); // answer: $185

		payCheck(50, 12.50); // answer: $687.50
								// (the first 40 hours are paid at $12.50
								// the next 10 hours are at $12.50*1.5)

		payCheck(45, 15.00); // answer: $712.50
	
		keyboard.close();
	}
	
	
	public static void payCheck(int hours, double rate) {
		double amount = (hours * rate);
		
		if (hours <= 40) {
			System.out.printf("Worked %d hour(s) at a rate of %.2f for a total pay of $%.2f\n", hours, rate, amount);
			return; 
		}
		
		int overtimeHours = hours - 40;
		double overtimeRate = overtimeHours * rate;
		double overtimePay = amount - overtimeRate;
		double total = overtimePay + (1.5 * overtimeRate);
		
		System.out.printf("Worked %d hour(s) at a rate of %.2f (with overtime) for a total pay of $%.2f\n", hours, rate, total);
	}
	
	
	
}
