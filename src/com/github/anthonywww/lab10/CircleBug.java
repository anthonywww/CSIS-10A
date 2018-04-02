package com.github.anthonywww.lab10;

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
