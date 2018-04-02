package com.github.anthonywww.lab10;

/**
 * Circle bug pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public class CircleBug extends PatternBug {
	
	public CircleBug(int sideLength) {
		super(sideLength);
		
	}
	
	@Override
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			steps = 0;
		}
	}
	
}
