package com.github.anthonywww.assignment11;

import java.util.Scanner;

/**
 * Write a description of class PlayingCardTestApp here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayingCardTestApp {

	public static void main(String[] args) {

		// *********** Problem 6 ******************************
		// Do problems 1-4 in the PlayingCard class first
		// 6) Verify your class works by running this program
		PlayingCard card1 = new PlayingCard();
		card1.print();

		PlayingCard card2 = new PlayingCard('S', 13);
		card2.print();

		// ***************** end problem 6 ********************/
		// ************ Problem 7 ******************************
		// 7) Add code to create a PlayingCard object
		// representing the Jack of Diamonds and print
		// the object to the screen
		PlayingCard jackOfDiamonds = new PlayingCard('D', 11);
		jackOfDiamonds.print();

		// ***************** end problem 7 *******************/
		// ************ Problem 8 ******************************
		// 8) Add code to compare the ranks of two PlayingCard objects
		// and print the card that has the higher rank
		if (card1.getValue() > card2.getValue()) {
			card1.print();
		} else {
			card2.print();
		}

		// ***************** end problem 8 *******************/
		// ************ Problem 9 ******************************
		// Write statements that read a complete set
		// of PlayingCard information from a keyboard Scanner into
		// temporary local variables for suit and rank
		// then create a new PlayingCard object with that info

		Scanner sc = new Scanner(System.in);
		PlayingCard card = new PlayingCard();
		card.setSuit('\0');

		do {
			System.out.print("Enter the card suit name (e.g. Spades): ");
			String cardName = sc.next();

			if (cardName.equalsIgnoreCase("Clubs")) {
				card.setSuit('C');
			} else if (cardName.equalsIgnoreCase("Hearts")) {
				card.setSuit('H');
			} else if (cardName.equalsIgnoreCase("Spades")) {
				card.setSuit('S');
			} else if (cardName.equalsIgnoreCase("Diamonds")) {
				card.setSuit('D');
			}

		} while (card.getSuit() == '\0');

		System.out.print("Enter the card value (1-12): ");
		card.setValue(sc.nextInt());

		sc.close();

		card.print();

		// ***************** end problem 9 *******************/

	}

}
