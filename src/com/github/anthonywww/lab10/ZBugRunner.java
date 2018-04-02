package com.github.anthonywww.lab10;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * ZBug pattern entry-point
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public class ZBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		ZBug alice = new ZBug(3);
		
		world.add(new Location(0, 0), alice);
		world.show();
	}
	
	
}