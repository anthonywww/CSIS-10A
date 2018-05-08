package com.github.anthonywww.assignment16;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.github.anthonywww.assignment13.Card;

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
		ArrayList<Card> deck = new ArrayList<Card>(); // upgrade from array of Card

		// a) finish the makeDeck method below. This method fills the deck array
		// with info for 52 cards read from cards.txt

		makeDeck(deck);
		System.out.println("The first card in deck is " + deck.get(0));
		System.out.println("The last card in deck is " + deck.get(51));

		ArrayList<Card> playerHand = new ArrayList<Card>(); // player can have unlimited cards
		ArrayList<Card> computerHand = new ArrayList<Card>();

		int playerScore = 0;
		int computerScore = 0;

		System.out.print("Player hand = " + playerHand);

		// b) finish the score method below main. It adds up and returns
		// the blackJackValue of all the cards in the ArrayList passed to it
		// initially the score will be zero.
		System.out.println(" Player score = " + score(playerHand));

		System.out.print("Player, hit or stay? ");
		answer = keyboard.next();

		while (answer.equals("hit")) {
			System.out.println("Dealing ... ");
			// c) finish the deal method below main. It picks a random index from 0 to 51
			// and returns the card in the deck array at that index
			playerHand.add(deal(deck)); // add a new card to the hand

			System.out.print("player hand = " + playerHand);

			playerScore = score(playerHand);
			System.out.println(" Player score = " + playerScore);

			System.out.print("Player, hit or stay? ");
			answer = keyboard.next();
		}

		System.out.print("Computer: ");

		// d) finish the while loop for the computer's turn:

		while (computerScore < 16) { // the computer automatically stays at 16
			System.out.println("Dealing ... ");
			// deal a card to the computerHand ArrayList
			computerHand.add(deal(deck));

			// print the computer hand
			System.out.print("computer hand = " + computerHand);

			// compute the computerScore
			computerScore = score(computerHand);

			// print the computerScore
			System.out.println("Computer score = " + computerScore);
		}

		// e) determine and print the outcome of the game
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

	public static void makeDeck(ArrayList<Card> deck) throws FileNotFoundException {
		// make a Scanner inputFile and connect to file cards.txt
		Scanner inputFile = new Scanner(BlackJackGame.class.getResourceAsStream("cards.txt"));

		// while loop, as long as k<52 AND there is more info in file

		// read a char from the file, store in suit

		// read an int from the file, store in rank

		// make a Card temp a new Card with the suit and rank you read

		// assign temp to the next location in the deck array

		// add 1 to k for next time around

		int k = 0;

		while (k < 52 && inputFile.hasNext()) {
			char suit = inputFile.next().charAt(0);
			int rank = inputFile.nextInt();
			Card temp = new Card(suit, rank);
			deck.add(temp);
			k++;
		}
		inputFile.close();
	}

	public static Card deal(ArrayList<Card> deck) {
		// use the randomInt method to generate
		// a random integer between 0 (inclusive) to 52 (exclusive)

		// store the card at your randomIndex into a tempCard variable.

		// remove the card in the deck at randomIndex

		// OPTIONAL: you might check the size of the deck and
		// if it's zero, call makeDeck to get a new Deck

		// return your tempCard
		return deck.get(randomInt(0, 52));

		// return null; // delete this after writing the above
	}

	public static int randomInt(int low, int high) {
		// returns a random int from low (inclusive) to high (exclusive)
		// Determine the span of the range.
		int range = high - low;

		// return a random number from the range.
		return (int) (range * Math.random()) + low;
	}

	public static int score(ArrayList<Card> hand) {
		int result = 0;
		// for loop: k goes from 0 to count-1
		// add blackJackValue of hand[k] to score variable

		for (int k = 0; k < hand.size(); k++) {
			result += hand.get(k).getRank();
		}
		return result;

		// return 0; // fix
	}

	public static int blackJackValue(Card c) {
		if (c.getRank() < 11)
			return c.getRank();
		else
			return 10;
	}

}
