package com.github.anthonywww.lab8;

/**
 * String demos
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/3/2018
 */
public class StringDemo {
	
	public static void main(String[] args) {
		System.out.println("\f");
		
		// 1
		char ltr = 'c';
		if (ltr == 'c') {
			System.out.println(ltr);
		}

		String fruit = "banana";
		char letter = fruit.charAt(1);
		System.out.println(letter);

		// 2
		int length = fruit.length();
		//char last = fruit.charAt(length - 1);

		// 3
		int index = 0;
		while (index < fruit.length()) {
			//char letter2 = fruit.charAt(index);
			System.out.println(letter);
			index = index + 1;
		}
		
		

		// ADD A LOOP that prints the letters in fruit backwards
		for (int i=fruit.length(); i > 0; i--) {
			System.out.println(fruit.charAt(i));
		}
		
		// 6
		index = fruit.indexOf('a');
		System.out.println("Index of first 'a' is " + index);
		index = fruit.indexOf('a', 2);
		System.out.println("Index of second 'a' is " + index);
		index = fruit.indexOf('a', 5);
		System.out.println("Index of third 'a' is " + index);

		// 7

		int count = 0;
		length = fruit.length();
		index = 0;
		while (index < length) {
			if (fruit.charAt(index) == 'a') {
				count = count + 1; // or count++;
			}
			index = index + 1; // or index++;
		}
		System.out.println("Number of a's found = " + count);

		// 9
		//String name = "Alan Turing";
		//String upperName = name.toUpperCase();

		// 10
		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";

		if (name1.equals(name2)) {
			System.out.println("The names are the same.");
		}

		int flag = name1.compareTo(name2);
		if (flag == 0) {
			System.out.println("The names are the same.");
		} else if (flag < 0) {
			System.out.println("name1 comes before name2.");
		} else if (flag > 0) {
			System.out.println("name2 comes before name1.");
		}
		
	}
	
	
}
