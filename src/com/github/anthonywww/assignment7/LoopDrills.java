package com.github.anthonywww.assignment7;

import java.util.Scanner;

/**
 * LoopDrills
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/05/2018
 */
public class LoopDrills {

	public static void main(String[] args) {
		System.out.println("\f");
		Scanner keyboard = new Scanner(System.in);

		// ****************** Problem 1 Multiple Assignment
		// *************************
		System.out.println("****************** P1 *********************");
		// observer the output of these four statements,
		// then add statements where indicated below.
		int x = 5;
		System.out.println("after assigning 5 to x, x = " + x);
		
		x = 7;
		System.out.println("after assigning 7 to x, x = " + x);

		int y = 3;
		// a) assign the value of y to x here (this means x = y;)
		x = y;
		System.out.println("after assigning y to x, x = " + x + " (should be 3)");

		// demonstrates assigning the result of adding x + 1 back to x
		x = x + 1;
		System.out.println("after assigning x + 1 to x, x = " + x + " (should be 4)");

		// b) assign the result of adding x + 5 back to x
		x += 5;
		System.out.println("after assigning x + 5 to x, x = " + x + " (should be 9!)");

		// c) use System.out.println to determine the effect of this statement
		// on the
		// value stored in x
		x++;
		System.out.println(x);

		// d) use System.out.println to determine the effect of this statement
		// on the
		// value stored in x
		x--;
		System.out.println(x);

		System.out.println("****************** P2 *********************");
		// Run this loop and observe the output.
		// Then modify the loop controls at a), b) and c) so it prints
		// "0, 2, 4, 6, 8, Done!"

		int n = 10; // a) initialize the value of n
		while (n > 0) // b) test the value in n
		{
			System.out.println(n);
			n -= 1; // c) change the value in n
		}
		System.out.println("Blastoff!"); // d) final message (only repeats once)

		System.out.println("****************** P3 *********************");
		// This loop is supposed to count up from 0 to 100 in steps of 10
		// But it has a couple errors. Fix it so it works right.
		// Remember, to halt an infinite loop in BlueJ,
		// R-click the red "barber pole" run indicator, then choose reset JVM

		int k = 0;
		while (k <= 100) {
			System.out.print(k + ", ");
			k += 10;
		}
		System.out.println("Done");

		
		System.out.println("****************** P4 *********************");
		// Run this program, then modify it using a While-loop to calculate
		// the area of three different circles, following the instructions
		// below.

		int count = 0;
		
		while (count < 3) {
			double radius, area;						// 1)
			System.out.println("Enter a radius "); 		// 2)
			radius = keyboard.nextDouble();				// 3)
			area = 3.14 * radius * radius;				// 4)
			System.out.println("The area is " + area);	// 5)
			count++;
		}
		
		// a) Above line 1) declare variable int count and initialize it to 0
		// b) insert a while statement after line 1) while (count < 3)
		// c) put lines 2 through 5 inside curly braces below your while header
		// d) before the close curly brace, (after line 5) increment count by 1.

		// Run your modified program and see that it computes area for three
		// circles

		System.out.println("****************** P5 *********************");
		// Run this program. Notice that to quit the loop, enter an age less
		// than 0
		//
		// Now add if statements to the loop to insult the person based on their
		// age
		// for people less than 13, "not ready for prime time"
		// for teenagers, "grow up"
		// for people 20 and over, "get a job!"
		// ...etc...

		int age = 0;

		while (age >= 0) {
			System.out.print("What is your age? ");
			age = keyboard.nextInt();
			System.out.println("Really, you are " + age + " years old?");
			if (age < 13) {
				System.out.println("not ready for prime time");
			} else if (age < 20) {
				System.out.println("grow up");
			} else {
				System.out.println("get a job!");
			}
		}

		System.out.println("****************** P6 *********************");
		// Run this program, then add a do-while loop to make sure
		// the input is between 1 and 100 before allowing the
		// the program to continue to the last statement.
		//
		int number;

		do {
		System.out.print("Enter a number in the " + "range of 1 through 100: ");
		number = keyboard.nextInt();
		} while (number < 1 || number > 100);

		System.out.println("Finally! You entered " + number);

		System.out.println("****************** P7 *********************");
		// Run this program, which makes a table converting Centigrade to
		// Fahrenheit
		// then make another table as indicated below.

		double tempF;
		double tempC = 20;
		
		while (tempC <= 40) {
			tempF = 1.8 * tempC + 32;
			System.out.println(tempC + " C = " + tempF + " F");
			tempC = tempC + 5;
		}

		// NOW make your own table of miles to kilometers using a loop as above
		// miles on the left, from 10 to 100 miles, steps of 10
		// km on the right
		// remember km = miles*1.609344
		
		double miles = 10;
		double kilometers;
		
		while (miles <= 100) {
			kilometers = miles * 1.609344;
			System.out.println(miles + " miles = " + kilometers + " kilometers");
			miles += 10;
		}

		System.out.println("****************** P8 *********************");
		// Run this program and notice it calls the C2FTable method
		// defined below main. Notice the output.

		C2FTable(0, 100, 10);

		// now print a table from 30 to 50 degrees C, in steps of 1 deg C.
		C2FTable(30, 50, 1);
		
		// now write your own method below main to print miles to km tables
		// test using these calls
		miles2kmTable(20,120,5);
		miles2kmTable(20,55,0.1);
		
		keyboard.close();
	}

	public static void C2FTable(int startC, int stopC, int stepC) {
		double tempC = startC, tempF;
		while (tempC <= stopC) {
			tempF = 1.8 * tempC + 32;
			System.out.println(tempC + "C = " + tempF + "F");
			tempC = tempC + stepC;
		}
	}
	
	public static void miles2kmTable(int start, int end, double step) {
		double miles = start;
		while (miles < end) {
			System.out.printf("%1.1f miles = %.2f kilometers\n", miles, (miles * 1.609344));
			
			miles += step;
		}
	}
	
	
	
}