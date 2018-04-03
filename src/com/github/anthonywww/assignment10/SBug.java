package com.github.anthonywww.assignment10;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * A bug that makes a S pattern
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 4/03/2018
 */
public class SBug extends PatternBug {
	
	private int state;
	private boolean reverse;
	
	public SBug(int size) {
		super(PatternBug.Facing.NORTH_WEST, size);
		state = 1;
		reverse = false;
	}
	
	
	@Override
	public void act() {
		
		if (state < 0) {
			return;
		}
		
		/*
		 * 1 = move north-west
		 * 2 = move west n times
		 * 3 = move south-west
		 * 4 = move south n/2 times
		 * 5 = move south-east n times
		 * 6 = move south n/2 times
		 * 7 = move south-east  
		 * 8 = move east n times (and move north-east once)
		 * 9 = reverse
		 */
		
		System.out.println("State = " + state + " / Reverse = " + reverse + " / Facing = " + this.getDirection());
		
		switch (state) {
			
		case 1:
			if (step < 1) {
				if (!this.canMove()) {
					state = -1;
				}
				this.move();
				step++;
			} else {
				if (!reverse) {
					this.setDirection(Facing.WEST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH_WEST);
					step = 0;
					reverse = !reverse;
				}
				
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
				if (!reverse) {
					this.setDirection(Facing.SOUTH_WEST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.SOUTH_EAST);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.SOUTH);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.EAST);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.SOUTH_EAST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH_EAST);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.SOUTH);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.SOUTH_WEST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH_WEST);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.WEST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH);
					step = 0;
					state--;
				}
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
				if (!reverse) {
					this.setDirection(Facing.NORTH_WEST);
					step = 0;
					state++;
				} else {
					this.setDirection(Facing.NORTH_EAST);
					step = 0;
					state--;
				}
			}
			break;
			
			
			
			
			
		case 9:
			if (!this.canMove()) {
				state = -1;
			}
			this.move();
			this.setDirection(Facing.SOUTH_EAST);
			this.move();
			this.setDirection(Facing.EAST);
			reverse = !reverse;
			step = 0;
			state--;
			break;
			
		}
		
	}
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		SBug sbug = new SBug(3);
		
		world.add(new Location(2, 6), sbug);
		world.show();
	}
	
}
