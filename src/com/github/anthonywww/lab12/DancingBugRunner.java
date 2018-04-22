package com.github.anthonywww.lab12;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
	
	
	public static void main(String[] args) {
		
		// 2 declare and create an array called turns
		// that has 6 numbers in it, ranging from 0 to 7
		// (just type in any 6 numbers you like)
		
		ActorWorld world = new ActorWorld();
		int[] turns = new int[] {1, 4, 3, 5, 2, 6};

		// 3 instead of passing 6 to the constructor,
		// pass the turns array
		DancingBug alice = new DancingBug(turns);
		alice.setColor(Color.ORANGE);

		// 4 instead of passing 3 to the constructor,
		// pass the turns array
		DancingBug bob = new DancingBug(turns);
		
		
		DancingBug ant = new DancingBug(turns);
		DancingBug emily = new DancingBug(turns);
		
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.add(new Location(4, 4), ant);
		world.add(new Location(3, 3), emily);
		
		
		world.show();
	}
	
	
}