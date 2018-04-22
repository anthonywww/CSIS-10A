package com.github.anthonywww.lab12;

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {

		int[] stuff = new int[5];
		stuff[0] = 1;
		stuff[1] = 4;
		stuff[2] = 5;
		stuff[3] = 3;
		stuff[4] = 2;

		System.out.println("1a The length of the stuff array is: " + stuff.length);
		/*
		 * ----------------- Problem 1 ---------------------- // 1) do 1a, 1b, 1c HERE:
		 * displayArray(stuff); // ----------------- END Problem 1 -------------------
		 */
		displayArray(stuff);
		
		
		char[] word = new char[] { 'W', 'a', 'i', 't' };
		System.out.println("2a The length of the word array is: " + word.length);
		/*
		 * ----------------- Problem 2 ---------------------- // 2) do 2a, 2b, 2c HERE:
		 * displayArray(word); // ----------------- END Problem 2 -------------------
		 */
		displayArray(word);
		
		double[] moreStuff = new double[6];
		moreStuff[0] = 1.1;
		moreStuff[1] = 2.2;
		moreStuff[2] = 3.3;
		moreStuff[3] = 4.4;
		moreStuff[4] = 5.5;
		
		System.out.println("3a The length of the moreStuff array is: " + moreStuff.length);
		/*
		 * ----------------- Problem 3 ---------------------- // 3) do 3a-c, 3e-h HERE:
		 * // ----------------- END Problem 3 -------------------
		 */
		displayArray(moreStuff);
		moreStuff[2] = 1000.0;
		moreStuff[moreStuff.length-1] = 99;
		
		
		/*
		 * ----------------- Problem 4 ----------------------
		 */
		System.out.println("Problem 4a");
		int[] data = {0, 1, 2, 3, 4, 5};
		data[0] = 10;
		data[data.length-1] = 27;
		
		System.out.println(data[2]);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		data[4] = keyboard.nextInt();
		System.out.println();
		keyboard.close();
		
		displayArray(data);
		/*
		 * ----------------- END Problem 4 -------------------
		 */
		
		
		
		/*
		 * ----------------- Problem 5 ----------------------
		 */
		System.out.println("\nProblem 5a"); // 5) do 5a - 5e HERE
		double[] samples = new double[11];
		int index = 3;
		samples[index] = 10;
		samples[index+1] = 11;
		samples[index-2] = 7;
		displayArray(samples);
		/*
		 *  ----------------- END Problem 5 -------------------
		 */

		
		
		
		/*
		 * ----------------- Problem 6 ----------------------
		 */
		System.out.println("\nProblem 6");
		int array1[] = new int[] {2, 4, 6, 8, 10};
		int array2[] = array1;
		
		
		// Because of aliasing, this is creating a "pointer" to the same object reference in memory.
		array2[0] = 99;
		
		displayArray(array1);
		displayArray(array2);
		
		/*
		 * ----------------- END Problem 6 -------------------
		 */
		
		
		
		
		
		/*
		 * ----------------- Problem 7 ----------------------
		 */
		System.out.println("Problem 7");
		int[] array3 = new int[] {1,2,3,4,5};
		int[] array4 = cloneArray(array3);
		
		displayArray(array3);
		displayArray(array4);
		
		array4[0] = 99;
		
		displayArray(array3);
		displayArray(array4);
		
		/*
		 * ----------------- END Problem 7 -------------------
		 */
	}
	
	
	
	// 7) do 7a HERE:
	
	
	
	
	
	
	// 3) do 3d HERE:
	
	
	
	public static void displayArray(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.print(i + ":" + anArray[i] + "  ");
		}
		System.out.println();
	}

	public static void displayArray(char[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.print(i + ":" + anArray[i] + "  ");
		}
		System.out.println();
	}
	
	public static void displayArray(double[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			System.out.print(i + ":" + anArray[i] + "  ");
		}
		System.out.println();
	}
	
	private static int[] cloneArray(int[] array) {
		int array2[] = new int[array.length];
		
		for (int i=0;i<array.length;i++) {
			array2[i] = array[i];
		}
		
		return array2;
	}
	
}
