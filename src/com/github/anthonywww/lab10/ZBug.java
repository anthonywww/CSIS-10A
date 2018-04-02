package com.github.anthonywww.lab10;
import info.gridworld.grid.Location;

/**
 * ZBug pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public class ZBug extends PatternBug {
	
	private int state;
	
	public ZBug(int length) {
		super(length);
		this.setDirection(Location.EAST);
		
		steps = 0;
		state = 1;
	}
	
	
	@Override
	public void act() {
		
		if (state >= 4) {
			return;
		}
		
		switch(state) {
		
		case 1:
			if (steps < this.sideLength) {
				System.out.println("Move Top");
				if (!this.canMove()) {
					state = 4;
				}
				this.move();
				steps++;
			} else {
				steps = 0;
				state++;
				System.out.println("Turn Top");
				this.turn();
				this.turn();
				this.turn();
			}
			break;
			
			
		case 2:
			if (steps < this.sideLength) {
				System.out.println("Move Diagonal");
				if (!this.canMove()) {
					state = 4;
				}
				this.move();
				steps++;
			} else {
				steps = 0;
				state++;
				System.out.println("Turn Diagonal");
				this.turn();
				this.turn();
				this.turn();
				this.turn();
				this.turn();
			}
			break;
			
			
		case 3:
			// One extra execution to show the flowers as a Z-pattern
			if (steps <= this.sideLength) {
				System.out.println("Move Bottom");
				if (!this.canMove()) {
					state = 4;
				}
				this.move();
				steps++;
			} else {
				steps = 0;
				state++;
			}
			break;
		
		
		}
		
	}
	
	
	
}