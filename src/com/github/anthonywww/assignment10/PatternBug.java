package com.github.anthonywww.assignment10;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A generic bug pattern template
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 4/03/2018
 */
public abstract class PatternBug extends Bug {
	
	public final int sideLength;
	public int step;
	
	public PatternBug(Facing facing, int sideLength) {
		this.setDirection(facing.getValue());
		this.step = 0;
		this.sideLength = sideLength;
	}
	
	@Override
	public abstract void act();
	
	public void setDirection(Facing facing) {
		this.setDirection(facing.getValue());
	}
	
	/**
	 * Directions
	 */
	public enum Facing {
		
		NORTH(Location.NORTH),
		SOUTH(Location.SOUTH),
		EAST(Location.EAST),
		WEST(Location.WEST),
		NORTH_EAST(Location.NORTHEAST),
		NORTH_WEST(Location.NORTHWEST),
		SOUTH_EAST(Location.SOUTHEAST),
		SOUTH_WEST(Location.SOUTHWEST);
		
		private final int direction;
		
		private Facing(int direction) {
			this.direction = direction;
		}
		
		public final int getValue() {
			return direction;
		}
		
	}
	
}
