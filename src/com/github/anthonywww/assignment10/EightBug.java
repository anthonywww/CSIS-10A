package com.github.anthonywww.assignment10;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * A bug that makes a 8 pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 4/03/2018
 */
public class EightBug extends PatternBug {
	
	private int state;
	
	public EightBug(int size) {
		super(PatternBug.Facing.NORTH_WEST, size);
		state = 1;
	}
	
	
	@Override
	public void act() {
		
		if (state <= 0) {
			return;
		}
		
		System.out.println("State = " + state + " / Facing = " + this.getDirection());
		
		switch (state) {
			
		case 1:
			if (step < 1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.WEST);
				step = 0;
				state++;
			}
			break;
			
			
			
		case 2:
			if (step < this.sideLength-1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.SOUTH_WEST);
				step = 0;
				state++;
			}
			break;
			
			
			
			
			
		case 3:
			if (step < this.sideLength/2) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.SOUTH);
				step = 0;
				state++;
			}
			break;
			
			
			
			
			
		case 4:
			if (step < this.sideLength/2) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.SOUTH_EAST);
				step = 0;
				state++;
			}
			break;
			
			
			
			
			
		case 5:
			if (step < this.sideLength+1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.SOUTH);
				step = 0;
				state++;
			}
			break;
			
			
			
			
			
		case 6:
			if (step < this.sideLength/2) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.SOUTH_WEST);
				step = 0;
				state++;
			}
			break;
			
			
			
			
			
		case 7:
			if (step < this.sideLength/2) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.WEST);
				step = 0;
				state++;
			}
			break;
			
			
			
			
		case 8:
			if (step < this.sideLength-1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.NORTH_WEST);
				step = 0;
				state++;
			}
			break;
			
			
		// Come back around
		case 9:
			if (step < 1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.NORTH);
				step = 0;
				state++;
			}
			break;
			
			
		case 10:
			if (step < 1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.NORTH_EAST);
				step = 0;
				state++;
			}
			break;
			
			
		case 11:
			if (step < this.sideLength+1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.NORTH);
				step = 0;
				state++;
			}
			break;
			
			
			
			
		case 12:
			if (step < 1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				this.setDirection(Facing.NORTH_WEST);
				step = 0;
				state = 1;
			}
			break;
			
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		EightBug eightbug = new EightBug(3);
		
		world.add(new Location(2, 6), eightbug);
		world.show();
	}
	
}
