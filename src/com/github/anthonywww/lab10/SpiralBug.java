package com.github.anthonywww.lab10;

/**
 * Spiral bug pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public class SpiralBug extends PatternBug {
	
	public SpiralBug(int sideLength) {
		super(sideLength);
		
	}
	
	@Override
	public void act() {
		
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			turn();
			sideLength++;
			steps = 0;
		}
		
	}
	
}
