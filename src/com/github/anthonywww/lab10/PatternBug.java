package com.github.anthonywww.lab10;

import info.gridworld.actor.Bug;

/**
 * Abstract bug pattern class
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public abstract class PatternBug extends Bug {
	
	public int steps;
	public int sideLength;
	
	public PatternBug(int sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public abstract void act();
	
}
