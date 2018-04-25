package com.github.anthonywww.assignment12;

public class Assignment12 {

	public static void main(String[] args) {
		// * ----------------- Problem 1 ----------------------
		System.out.println("\n1)-------------------");

		for (int i = 0; i < 10; i++) {
			double x = Math.random();
			System.out.println(x);
		}

		System.out.println("1a)-------------------");
		// a) Copy above loop here, modify so x is between [0,10)
		for (int i = 0; i < 10; i++) {
			double x = (Math.random() * 9.9999);
			System.out.println(x);
		}

		System.out.println("1b)-------------------");

		// b) Copy above loop here, modify so x is between [15,25)
		for (int i = 0; i < 10; i++) {
			double x = (Math.random() * (25 - 15)) + 15;
			System.out.println(x);
		}

		System.out.println("1c)-------------------");

		// c) Copy above loop here, modify so x is between [70, 100)
		for (int i = 0; i < 10; i++) {
			double x = (Math.random() * (100 - 70)) + 70;
			System.out.println(x);
		}

		// what is the trick to solving these?
		// first determine the spread of the numbers (high - low)
		// then determine how far to shift them from 0 (low)
		// so in general, we multiply Math.random() by the spread
		// and add the shift.
		// Use these insights to solve problem 2
		//
		// ----------------- END Problem 1 ------------------- */

		// ----------------- Problem 2 ----------------------
		// 2) Write the definition of randomInt below main
		// do not change this loop! should produce nums from 25 to 39
		System.out.println("\n2)-------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println(randomInt(25, 40));
		}

		// ----------------- END Problem 2 -------------------

		// ----------------- Problem 3 -----------------------
		// 3) Uncomment randomArray method below main

		System.out.println("\n3)-------------------");
		int numValues = 10;
		int[] quizScores = randomArray(numValues);
		printArray(quizScores);

		// Run the above, THEN modify to produce an array of size 20. THEN modify
		// randomArray so the numbers in the array are between [0,10)
		// ----------------- END Problem 3 -------------------

		// ----------------- Problem 4 ----------------------
		System.out.println("\n4)-------------------");
		// 4) write your own loop to count how many values in
		// quizScores are between [3,8)

		int num = 0;
		for (int i = 0; i < quizScores.length; i++) {
			if (quizScores[i] >= 3 && quizScores[i] < 8) {
				num++;
			}
		}

		System.out.println("There are " + num + " values between 3 and 8");

		// ----------------- END Problem 4 -------------------

		// ----------------- Problem 5 ----------------------
		System.out.println("\n5)-------------------");
		// 5) Use the inRange method to do the same thing as 4)

		System.out.println("There are " + inRange(quizScores, 3, 8) + " values between 3 and 8");

		// ----------------- END Problem 5 -------------------

		// ----------------- Problem 6 ----------------------
		System.out.println("\n6)------------------");
		// 6) Create array counts as a histogram of quizScores
		// int [] counts = new int[10];
		// only go up to 10
		// because that's the highest quizScore you'll find
		// write a loop to tabulate the counts histogram here:
		int[] counts = new int[10];

		for (int score : quizScores) {
			counts[score]++;
		}

		printArray(counts);
		// ----------------- END Problem 6 -------------------

		/*
		 * ----------------- Problem 7 ---------------------- System.out.println("\n7");
		 * // 7) write a void method bar below main that uses a // loop to print a
		 * horizontal line of 'X's // (print 1 "X" each time through the loop)
		 * 
		 * bar(5); // should print XXXXX bar(8); // should print XXXXXXXX
		 * 
		 * // ----------------- END Problem 7 -------------------
		 */
		System.out.println("\n7)-----------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": ");
			bar(i);
		}

		/*
		 * ----------------- Problem 8 ---------------------- System.out.println("\n8");
		 * // write a loop that prints a bar chart of the counts array
		 * 
		 * 
		 * // ----------------- END Problem 8 -------------------
		 */
		System.out.println("\n8)-----------------");
		for (int i = 0; i < counts.length; i++) {
			System.out.print(i + 1 + ": ");
			bar(counts[i]);
		}

		/*
		 * ----------------- Problem 9 ---------------------- System.out.println("\n9");
		 * // encapsulate your answers to 6 and 8 into a method makeHist // demo your
		 * method here: int [] arr1 = randomArray(50);
		 * System.out.println("Array 1 Histogram: "); makeHist(arr1); int [] arr2 =
		 * randomArray(25); System.out.println("Array 2 Histogram: "); makeHist(arr2);
		 * 
		 * // ----------------- END Problem 9 -------------------
		 */
		System.out.println("\n9)-----------------");
		int[] arr1 = randomArray(50);
		System.out.println("Array 1 Histogram: ");
		makeHist(arr1);

		int[] arr2 = randomArray(25);
		System.out.println("Array 2 Histogram: ");
		makeHist(arr2);

		/*
		 * ----------------- Problem 10 Extra Credit (1 pt)-----
		 * System.out.println("\n10"); // write a method that finds a target in an
		 * array, // returning the index of the target or -1 if not found int [] arr3 =
		 * {0,10,20,99,40,50,60,70}; System.out.println("Position of 99 is " +
		 * find(arr3, 99)); // should say 3
		 * System.out.println("And here is the 99 value: " + arr3[find(arr3, 99)]); //
		 * should say 99
		 * 
		 * System.out.println("Position of 55 is " + find(arr3, 55)); // should say -1
		 * 
		 * // ----------------- END Problem 10 -------------------
		 */
		System.out.println("\n10)-----------------");
		int[] arr3 = { 0, 10, 20, 99, 40, 50, 60, 70 };
		System.out.println("Position of 99 is " + find(arr3, 99)); // 3
		System.out.println("And here is the 99 value: " + arr3[find(arr3, 99)]); // 99
		System.out.println("Position of 55 is " + find(arr3, 55)); // -1

		/*
		 * ----------------- Problem 11 (Extra Credit)-----------
		 * System.out.println("\n11"); // write a method that sorts an array using
		 * BubbleSort or // SelectionSort sort(quizScores); printArray(quizScores);
		 * 
		 * // ----------------- END Problem 11 -------------------
		 */
		System.out.println("\n11)-----------------");
		sort(quizScores);
		printArray(quizScores);

	}

	// Bubble Sort
	private static void sort(int[] array) {
		int temp = 0;

		for (int i=0; i<array.length; i++) {
			for (int j=1; j<array.length-i; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private static int find(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// 2) write randomInt method here:
	private static int randomInt(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	// 7) write your bar method here:
	// pseudocode:
	// void method bar, takes parameter int length
	// has for loop that repeats length times
	// prints 1 "X" to console
	// after loop, goes to new line (println)
	private static void bar(int length) {

		for (int i = 0; i <= length; i++) {
			System.out.print('X');
		}
		System.out.println();
	}

	// 9) write your makeHist method here:
	// pseudocode:
	// void method makeHist, takes parameter array of int scores
	// create a counts array as a histogram of scores (like prob6)
	// make a loop that prints a bar chart of the counts array
	// (like prob9)
	// (use your bar method to draw the horizontal lines)
	private static void makeHist(int[] scores) {
		int[] counts = new int[scores.length];

		for (int score : scores) {
			counts[score]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.print(i + " ");
			bar(counts[i]);
		}

	}

	public static int[] randomArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = randomInt(0, n);
		}
		return a;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high)
				count++;
		}
		return count;
	}
}
