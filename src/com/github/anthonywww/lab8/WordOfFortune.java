package com.github.anthonywww.lab8;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Word of fortune "game"
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/8/2018
 */
public class WordOfFortune {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner keyboard = new Scanner(System.in);
		String secret = randomWord("elementNames.txt");
		
//		do {
//			System.out.println("Player 1, enter a secret word, from 3 - 10 letters");
//			secret = keyboard.next().trim();
//		} while (secret.length() < 3 || secret.length() > 10);
		
		System.out.println("\f");
		
		
		/*
		System.out.println("The secret word is " + secret);
		System.out.println("It has " + secret.replaceAll(" ", "").length() + " letters");
		System.out.println("The first letter is " + secret.substring(0, 1));
		*/
		
		String guess;
		int count = 1;
		final int MAX_GUESSES = 10;
		
		do {
			
			if (count >= MAX_GUESSES) {
				keyboard.close();
				System.out.println("The word was " + secret);
				System.exit(0);
			}
			
			System.out.println("Enter a guess, it should have " + secret.length() + " letters" + (count > 1 ? " (you have " + (MAX_GUESSES - count) + " guess" + (MAX_GUESSES - count > 0 ? "es" : "") + " left) " : ""));
			
			guess = keyboard.nextLine().trim();
			
			if (guess.length() != secret.length()) {
				System.out.println("Wrong number of letters!");
				count++;
				continue;
			} else if(!guess.equalsIgnoreCase(secret)) {
				if (count >= 3 && guess.charAt(0) != secret.charAt(0)) {
					System.out.println("The first letter is " + secret.charAt(0));
				}
				printCorrectLetters(secret, guess);
			}
			
			if (count > 3 && count % 3 == 0) {
				for (int i=0;i<secret.length()-1;i++) {
					if (guess.charAt(i) != secret.charAt(i)) {
						System.out.println("HINT: The letter at location " + (i+1) + " is " + secret.charAt(i));
						break;
					}
				}
			}
			
			
			count++;
		} while (!guess.equalsIgnoreCase(secret));
		
		System.out.println("You got it in " + count + " guesses!");
		keyboard.close();
	}
	
	
	private static void printCorrectLetters(String secret, String guess) {
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				System.out.print(secret.charAt(i));
			} else {
				System.out.print('-');
			}
		}
		System.out.println();
	}
	
	private static int countWords(String fileName) throws FileNotFoundException {
		Scanner sc = new Scanner(ReadWordFile.class.getResourceAsStream(fileName));
		int count = 0;
		
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		sc.close();
		
		return count;
	}
	
	private static String randomWord(String fileName) throws FileNotFoundException {
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
