package com.github.anthonywww.lab12;

import info.gridworld.actor.Bug;

// do steps 1 through 4 in the BoxBugRunner class first
// then come back here to continue
/**
 * Box bug pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/18/2018
 */
public class DancingBug extends Bug {
	
	// 5a) add another instance variable, an int array
	// called hotMoves (but don't assign it anything)
	// 5b) add another instance variable called index

	private int[] hotMoves;
	private int index;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param turns
	 *            the side length
	 */
	// 6 instead of length, make the parameter an int array
	// called hotMoves
	public DancingBug(int[] hotMoves) {
		// 7a assign this.hotMoves the value of the hotMoves parameter
		// this saves a reference to the array given to the
		// constructor in the main method in DancingBugRunner
		// 7b initialize index to 0
		this.hotMoves = hotMoves;
	}

	public void act() {
		// 8 now we are going to turn the bug
		// the current number of turns at the
		// value in the hotMoves array indicated by
		// index.
		//
		// Use a while loop or a for loop to do this
		// the number of times the loop repeats
		// should be turns[index]
		// in the body of the loop, call the turn
		// method once
		
		
		for (int i=0; i<hotMoves[index]; i++) {
			this.turn();
		}
		
		// 9 add an if statement so that if the bug can move
		// it moves
		if (this.canMove()) {
			this.move();
		}

		// 10 add an if statement so that if index is equal to
		// the length of the hotMoves array, set index back to 0
		// (which starts us back at the beginning of the array)
		
		if (index >= hotMoves.length-1) {
			index = 0;
		} else {
			index++;
		}
		
	}
}
