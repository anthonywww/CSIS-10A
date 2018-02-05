package com.github.anthonywww.lab4;

/**
 * Flip a coin
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/05/2018
 */
public class CoinFlip {

	public static void main(String[] args) {

		int p1score = roll();
		System.out.println("Player 1 scored: " + p1score);
		
		int p2score = roll();
		System.out.println("Player 2 scored: " + p2score);
		
		if (p1score > p2score) {
			System.out.println("Player 1 won with a score of " + p1score);
		} else if (p1score < p2score) {
			System.out.println("Player 2 won with a score of " + p2score);
		} else {
			System.out.println("Both flips had the same score");
		}
		
		System.out.println("The higher score was: " + Math.max(p1score, p2score));
		
	}
	
	public static int roll() {
		double number = Math.random();
		int score = 0;
		
		if (number < .4) {
			System.out.println("heads");
			score = 5;
		} else if (number < .8) {
			System.out.println("tails");
			score = 2;
		} else if (number < .85) {
			System.out.println("landed on the edge!");
			score = 20;
		} else {
			System.out.println("fell off the table");
			score = -3;
		}
		
		return score;
	}
	

}
