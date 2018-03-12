package com.github.anthonywww.lab8;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read strings from files
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/8/2018
 */
public class ReadWordFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Number of words in the file is " + countWords("words.txt"));
		System.out.println("Number of words in the file is " + countWords("elementNames.txt"));
		System.out.println("Random word from elementNames.txt is " + randomWord("elementNames.txt"));
	}
	
	public static int countWords(String fileName) throws FileNotFoundException {
		Scanner sc = new Scanner(ReadWordFile.class.getResourceAsStream(fileName));
		int count = 0;
		
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		sc.close();
		
		return count;
	}
	
	public static String randomWord(String fileName) throws FileNotFoundException {
		Scanner sc = new Scanner(ReadWordFile.class.getResourceAsStream(fileName));
		String word = "";
		int count = 0;
		
		int n = (int) (countWords(fileName) * Math.random()) + 1;
		while (count < n) {
			word = sc.next();
			count++;
		}
		
		sc.close();
		return word;
	}
	
}
