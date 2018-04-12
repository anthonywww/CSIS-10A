package com.github.anthonywww.assignment11;

import java.util.Scanner;

/**
 * Write a description of class ScrabbleTileTestApp here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrabbleTileTestApp {

	public static void main(String[] args) {

		// *********** Problem 6 ******************************
		// Do problems 1-4 in the Tile class first
		// 6) Verify your class works by running this program
		Tile tile1 = new Tile();
		tile1.print();

		Tile tile2 = new Tile('J', 8);
		tile2.print();

		// ***************** end problem 6 ********************/
		// ************ Problem 7 ******************************
		// 7) Add code to create a Tile object with
		// the letter 'Z' and value 10 and print the object
		// to the screen
		Tile zTile = new Tile('Z', 10);
		zTile.print();

		// ***************** end problem 7 *******************/
		// ************ Problem 8 ******************************
		// 8) Add code to compare the values of two Tile objects
		// and print the object that has the higher value
		if (tile1.getValue() > tile2.getValue()) {
			tile1.print();
		} else {
			tile2.print();
		}

		// ***************** end problem 8 *******************/
		// ************ Problem 9 ******************************
		// Write statements that read a complete set
		// of Tile information from a keyboard Scanner into
		// temporary local variables for letter and value
		// then create a new Tile object with that info

		// a) declare local variables to store Tile info

		Scanner scanner = new Scanner(System.in);
		
		Tile tile = new Tile();

		System.out.println("Enter the letter: ");
		tile.setLetter(scanner.next().charAt(0));
		
		System.out.println("Enter the numerical value of the character '" + tile.getLetter() + "': ");
		tile.setValue(scanner.nextInt());
		
		scanner.close();
		
		tile.print();
		
		// ***************** end problem 9 *******************/

	}

}
