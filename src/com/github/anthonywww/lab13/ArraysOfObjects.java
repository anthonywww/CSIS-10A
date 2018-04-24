package com.github.anthonywww.lab13;

/**
 * Write a description of class ArrayOfObjects here.
 * 
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 4/23/2018
 */
public class ArraysOfObjects {
	
	public static void main(String[] args) {
		/*
		 * ======= Problem 0 Before You Begin========================== // Make sure you
		 * define and testing the Employee Class // You may want to review the code in
		 * Time and Student classes to help you //------- End Problem 0
		 * ------------------------------------
		 */

		// *======= Problem 1 Review of Classes and Objects ============
		// a) Make a variable t, of type Time, set to 11:28:42
		Time t = new Time(11, 28, 42);

		System.out.print("Here is what is in object t ");
		t.print();

		// b) Make a variable emp, of type Employee, set to ("Jamal", 43434,56400.00)
		// and print it
		Employee emp = new Employee("Jamal", 43434, 56400.00);

		// ------- End Problem 1 ------------------------------------*/

		// *======= Problem 2 Arrays of Time and String Objects ============
		// a) Make an array of 5 Time objects called meetingTimes,
		Time[] meetingTimes = new Time[5];

		// b) assign the following times to cells [0] through [4] of meetingTimes:
		// 8:30, 10:00, 12:30, 3:00 and 5:15
		meetingTimes[0] = new Time(8, 30, 00);
		meetingTimes[1] = new Time(10, 00, 00);
		meetingTimes[2] = new Time(12, 30, 00);
		meetingTimes[3] = new Time(3, 00, 00);
		meetingTimes[4] = new Time(5, 15, 00);

		// c) change the last meeting time to 6:15 by
		// selecting to index 4 of the meetingTimes array,
		// and using the setHour and setMinute methods to change the time
		meetingTimes[4].setHour(6);
		meetingTimes[4].setMinute(15);

		// d) Declare an array of 5 String objects called locations and
		// use an initialization list to store these Strings in the array
		// i.e set the array = {"BMC205","BMC207","PS106","GA103","BMC202B"};
		String[] locations = new String[] { "BMC205", "BMC207", "PS106", "GA103", "BMC202B" };

		// e) Use a for loop to traverse both arrays with the same index
		// and print the times and locations of the meetings
		// so it says something like:
		// At 8:30 you have a meeting in BMC205
		// At 10:00 you have a meeting in BMC207 and so on
		//
		// Build the output using System.out.println, and for meetingTimes[k]
		// use .getHour() and .getMinute() with a ":" between them
		for (int i = 0; i < meetingTimes.length; i++) {
			System.out.printf("At %d:%d you have a meeting in %s\n", meetingTimes[i].getHour(),
					meetingTimes[i].getMinute(), locations[i]);
		}

		// ------- End Problem 2 ------------------------------------*/

		// *======= Problem 3 Arrays of Employee Objects ============
		// a) Make an array of 6 Employee objects called startup
		// and make all its elements refer to default Employee objects
		// (use a for loop and assign each cell a new Employee())
		Employee[] startup = new Employee[6];

		for (int i = 0; i < startup.length; i++) {
			startup[i] = new Employee();
		}

		// b) Define the method printAllEmployees where indicated below main
		// then activate the following 2 statements:
		System.out.println("Here are the employees at our new startup:");
		printAllEmployees(startup);

		// c) Set the first three elements to new Employees with fictitious
		// names, IDs and salarys (like John Pilsner, 1111,35000 ... etc)
		// and print all the employees again
		startup[0] = new Employee("John Pilsner", 1111, 35000);
		startup[1] = new Employee("Bob Sagget", 0, 1983844);
		startup[2] = new Employee("George Desand", 1337, 1.04);
		printAllEmployees(startup);

		// d) If a 5% raise can be given by setting an employees salary *= 1.05,
		// define the method giveRaiseToAll where indicated below main,
		// then activate the following statements:

		System.out.println("After giving a 5% raise to all workers:");
		giveRaiseToAll(startup, 5);
		printAllEmployees(startup);

		// ------- End Problem 3 ------------------------------------*/
	}

	// 3b) Define the static void method printAllEmployees here
	// in this method, use a for loop to .print() all the items in array
	public static void printAllEmployees(Employee[] emps) {
		for (int i = 0; i < emps.length; i++) {
			emps[i].print();
		}
	}

	// 3c) Define the static void method giveRaiseToAll here
	// it receives as parameters an array of Employees and a double rate
	// in this method, define a double scale variable
	// and set scale equal to 1 + rate/100
	// then use a for loop to access each employee
	// and use the getSalary and setSalary methods to
	// change the salary to a new salary that is scale * old salary
	// you can do this in one line using "composition"
	// or in several lines using local variables to store
	// intermediate values
	public static void giveRaiseToAll(Employee[] emps, double rate) {
		for (int i = 0; i < emps.length; i++) {
			emps[i].setSalary((1 + rate / 100) * emps[i].getSalary());
		}
	}

}
