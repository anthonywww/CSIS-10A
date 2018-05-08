package com.github.anthonywww.assignment13;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a description of class ScrabbleGame here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJackGame {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner keyboard = new Scanner(System.in);
		String answer;
		Card[] deck = new Card[52];

		// a) finish the makeDeck method below. This method fills the deck array
		// with info for 52 cards read from cards.txt
		// makeDeck(deck); // read a file of Card values into the deck array

		makeDeck(deck);

		System.out.println("The first card in deck is " + deck[0]);
		System.out.println("The last card in deck is " + deck[51]);

		Card[] playerHand = new Card[10]; // player can have up to 10 cards
		Card[] computerHand = new Card[10];

		int playerCount = 0; // how many cards are in the playerHand array
		int computerCount = 0; // how many cards are in the computerHand array
		int playerScore = 0, computerScore = 0;

		System.out.print("Player hand = ");
		// b) add the printCards method below main. It only prints playerCount cards in
		// the array
		// printCards(playerHand, playerCount);
		printCards(playerHand, playerCount);

		// c) add the blackJackValue method below main, then test with the following
		// two lines of code. The blackJack value is the rank for ranks 1-10,
		// and 10 for all others
		Card test = new Card('S',12);
		System.out.println("The blackjack value of test card = " +
		blackJackValue(test));

		// d) finish the score method below main. It adds up and returns
		// the blackJackValue of the first count cards in the array passed to it
		// initially the score will be zero.
		System.out.println("Player score = " + score(playerHand, playerCount));

		System.out.print("Player, hit or stay? ");
		answer = keyboard.next();

		while (answer.equals("hit")) {
			System.out.println("Dealing ... ");
			// e) finish the deal method below main. It picks a random index from 0 to 51
			// and returns the card in the deck array at that index
			playerHand[playerCount] = deal(deck);
			playerCount++;

			System.out.print("player hand = ");
			printCards(playerHand, playerCount);

			playerScore = score(playerHand, playerCount);
			System.out.println("Player score = " + playerScore);

			System.out.print("Player, hit or stay? ");
			answer = keyboard.next();
		}

		System.out.print("Computer: ");

		// f) finish the while loop for the computer's turn:

		while (computerScore < 16) { // the computer automatically stays at 16
			System.out.println("Dealing ... ");
			// deal a card to the computerHand array
			computerHand[computerCount] = deal(deck);

			// increase computerCount
			computerCount++;

			// print the computer hand
			System.out.print("computer hand = ");
			printCards(computerHand, computerCount);

			// compute the computerScore
			computerScore = score(computerHand, computerCount);
			
			// print the computerScore
			System.out.println("Computer score = " + computerScore);
		}

		// g) determine and print the outcome of the game
		// based on playerScore and computerScore
		if ((playerScore > 21 && computerScore > 21) || (playerScore == computerScore)) {
			System.out.println("Bust- Tie!");
		} else if ((playerScore > computerScore) && playerScore <= 21) {
			System.out.println("Player won!");
		} else {
			System.out.println("Computer won!");
		}
			
		keyboard.close();
	} // END OF MAIN METHOD

	private static void printCards(Card[] playerHand, int playerCount) {
		for (int i=0;i<playerCount;i++) {
			System.out.print("[" + playerHand[i] + "] ");
		}
		System.out.println();
	}
	
	
	
	public static void makeDeck(Card[] deck) throws FileNotFoundException {
		// make a Scanner inputFile and connect to file cards.txt
		Scanner sc = new Scanner(BlackJackGame.class.getResourceAsStream("cards.txt"));

		int k = 0;
		// while loop, as long as k < 52 AND there is more info in file
		while (k < 52 && sc.hasNext()) {
			char suit = sc.next().charAt(0);
			int rank = sc.nextInt();

			Card temp = new Card(suit, rank);

			deck[k] = temp;
			k++;
		}

		sc.close();
	}

	public static Card deal(Card[] deck) {
		// use the randomInt method to generate
		// a random integer between 0 (inclusive) to 52 (exclusive)
		int rand = randomInt(0, 52);

		// return the card in deck at your randomIndex
		return deck[rand];
	}

	public static int randomInt(int low, int high) {
		// returns a random int from low (inclusive) to high (exclusive)
		// Determine the span of the range.
		int range = high - low;

		// return a random number from the range.
		return (int) (range * Math.random()) + low;
	}

	public static int score(Card[] hand, int count) {
		int result = 0;
		// for loop: k goes from 0 to count-1
		// add blackJackValue of hand[k] to score variable

		for (int k = 0; k < count; k++) {
			result += blackJackValue(hand[k]);
		}
		return result;
	}

	public static int blackJackValue(Card c) {
		// if the rank of Card c is less than or equal to 10
		// just return the rank
		if (c.getRank() <= 10) {
			return c.getRank();
		}

		return 10;
	}
}
