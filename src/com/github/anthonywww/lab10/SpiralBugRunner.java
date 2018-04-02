package com.github.anthonywww.lab10;
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

/**
 * Spiral bug entry-point
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 04/01/2018
 */
public class SpiralBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new UnboundedGrid<>());
		
		SpiralBug bob = new SpiralBug(3);
		bob.setColor(Color.RED);
		
		world.add(new Location(3, 4), bob);
		
		world.show();
	}
	
	
	
}