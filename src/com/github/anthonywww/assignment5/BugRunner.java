package com.github.anthonywww.assignment5;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class BugRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(); // create a new gridworld where
												// actors can roam

		Rock pebble = new Rock(); // create a new Rock object and store it in
									// pebble
		world.add(pebble); // add pebble to the world
		pebble.moveTo(new Location(2, 2)); // move pebble to row 2, column 2
											// (upper left corner is 0,0)

		Bug bizzy = new Bug(); // creat a new Bug object and store it in bizzy
		world.add(bizzy); // add bizzy to the world
		
		// move bizzy to row 4, colunn 4
		bizzy.moveTo(new Location(4, 4));

		vertRockLine(world, 6, 6, 5); // add a vertical line of 5 rocks starting at 6,6 and going up
		
		// add another vertical line of 4 rocks starting at 6,2 and going up
		vertRockLine(world, 6, 2, 4);
		
		horizRockLine(world, 6, 6, 4);
		
		horizRockLine(world, 2, 6, 4);

		world.show();
	}

	public static void vertRockLine(ActorWorld world, int row, int col, int numRocks) {
		if (numRocks > 0) {
			Rock p = new Rock();
			world.add(p);
			p.moveTo(new Location(row, col));
			vertRockLine(world, row - 1, col, numRocks - 1);
		}
	}
	
	public static void horizRockLine(ActorWorld world, int row, int col, int numRocks) {
		if (numRocks > 0) {
			Rock p = new Rock();
			world.add(p);
			p.moveTo(new Location(row, col));
			horizRockLine(world, row, col - 1, numRocks - 1);
		}
	}
	
	
}
