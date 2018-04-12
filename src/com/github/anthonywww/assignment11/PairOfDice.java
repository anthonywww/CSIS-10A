package com.github.anthonywww.assignment11;

import java.util.Random;

/**
 * Write a description of class PairOfDice here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class PairOfDice {
	
	private int die1;
	private int die2;
	
	public PairOfDice() {
		die1 = 1;
		die2 = 1;
	}
	
	public PairOfDice(int die1, int die2) {
		this.die1 = die1;
		this.die2 = die2;
	}
	
	public int getTotal() {
		return die1 + die2; 
	}
	
	public void roll() {
		Random rand = new Random();
		die1 = rand.nextInt(7);
		die2 = rand.nextInt(7);
	}
	
	public void print() {
		System.out.printf("1st die = %d, 2nd die = %d (sum = %d)\n", die1, die2, die1+die2);
	}
	
}
