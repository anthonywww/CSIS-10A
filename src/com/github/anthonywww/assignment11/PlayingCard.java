package com.github.anthonywww.assignment11;

/**
 * Write a description of class PlayingCard here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayingCard {
	
	private char suit;
	private int rank;
	
	public PlayingCard() {
		this.suit = 'C';
		this.rank = 1;
	}
	
	// 3) define the explicit (parameter) constructor here
	public PlayingCard(char suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// 4) define the get and set methods here
	// (getSuit, getValue, setSuit, setValue)
	public char getSuit() {
		return suit;
	}
	
	public void setSuit(char suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return rank;
	}
	
	public void setValue(int rank) {
		this.rank = rank;
	}

	// 5) define the print method here
	public void print() {
		String properSuit = "Unknown";
		
		switch (suit) {
			case 'C':
				properSuit = "Clubs";
				break;
				
			case 'S':
				properSuit = "Spades";
				break;
				
			case 'H':
				properSuit = "Hearts";
				break;
				
			case 'D':
				properSuit = "Diamonds";
				break;
		}
		
		System.out.printf("%d of %s\n", rank, properSuit);
	}
}
