package com.github.anthonywww.lab5;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

/**
 * Test Bug with the library GridWorld
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/17/2018
 */
public class BugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new UnboundedGrid<Actor>());
		Bug bug = new Bug();
		
		
		world.add(bug);
		world.add(new Rock());
		world.show();
		
		bug.moveTo(new Location(20, 20));
		
		//moveBug(bug, 10);
		randomBug(bug, 20);
	}
	
	
	public static void moveBug(Bug bug, int times) {
		if (times > 0) {
			if (bug.canMove()) {
				bug.move();
				moveBug(bug, times-1);
			} else {
				bug.turn();
				moveBug(bug, times);
			}
		}
	}
	
	public static void randomBug(Bug bug, int times) {
		if (times > 0) {
			double rand = Math.random();
			
			if (rand < 0.25) {
				bug.setDirection(0);
			} else if (rand < 0.5) {
				bug.setDirection(90);
			} else if (rand < 0.75) {
				bug.setDirection(180);
			} else {
				bug.setDirection(270);
			}
			
			if (bug.canMove()) {
				bug.move();
				colorBug(bug);
				randomBug(bug, times-1);
			} else {
				randomBug(bug, times);
			}
		}
	}
	
	public static void colorBug(Bug bug) {
		Random rand = new Random();
		float x = 1.0f / Math.max(1, (bug.getLocation().getCol()));
		
		float r = (rand.nextFloat() / 2f) + x;
		float g = (rand.nextFloat() / 2f) + x;
		float b = (rand.nextFloat() / 2f) + x;
		bug.setColor(new Color(r,g,b));
	}
	
}
