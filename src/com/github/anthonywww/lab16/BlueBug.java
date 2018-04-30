
package com.github.anthonywww.lab16;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BlueBug extends Bug {
	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		randomTurn();
		if (!canMove()) {
			return;
		}
		move();

		Location loc = getLocation();
		Grid<Actor> grid = getGrid();
		ArrayList<Actor> neighbors = grid.getNeighbors(loc);

		for (int i = 0; i < neighbors.size(); i++) {
			Actor actor = neighbors.get(i);
			System.out.println("i = " + i + "actor = " + actor);
		}

		for (Actor actor : neighbors) {
			if (actor instanceof Rock) {
				actor.setColor(Color.blue);
			}
		}
	}

	/*
	 * Turns left or right 45 degrees at random.
	 */
	public void randomTurn() {
		if (Math.random() < 0.5) {
			turn(-45);
		} else {
			turn(45);
		}
	}

	/*
	 * Turns the given number of degrees.
	 */
	public void turn(int degrees) {
		setDirection(getDirection() + degrees);
	}
}
