package com.github.anthonywww.lab16;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BattleBug extends Bug {
	private int steps;
	private int sideLength;
	private int winFlower;
	private int flowers;
	private ArrayList<Location> list;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public BattleBug(int length, int winFlower) {
		steps = 0;
		sideLength = length;
		this.winFlower = winFlower;
		flowers = 0;
	}

	public void move() {
		Grid<Actor> grid = getGrid();

		if (grid == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());

		if (grid.isValid(next)) {
			Actor neighbor = grid.get(next);
			if (neighbor instanceof Flower) {
				flowers++;
			}
			moveTo(next);
		} else {
			removeSelfFromGrid();
		}

		// Flower flower = new Flower(getColor());
		// flower.putSelfInGrid(gr, loc);
	}

	private int direction(Location from, Location to) {
		int yDest = to.getRow();
		int xDest = to.getCol();
		int yFrom = from.getRow();
		int xFrom = from.getCol();
		int direction = 0;

		if (xDest > xFrom && yDest > yFrom) {
			direction = 225; // 315
		} else if (xDest > xFrom && yDest == yFrom) {
			direction = 90; // 0
		} else if (xDest > xFrom && yDest < yFrom) {
			direction = 45; // 45
		} else if (xDest == xFrom && yDest > yFrom) {
			direction = 180; // 270
		} else if (xDest == xFrom && yDest == yFrom) {
			direction = 0; // -1
		} else if (xDest == xFrom && yDest < yFrom) {
			direction = 0; // 90
		} else if (xDest < xFrom && yDest > yFrom) {
			direction = 225; // 225
		} else if (xDest < xFrom && yDest == yFrom) {
			direction = 270; // 180
		} else if (xDest < xFrom && yDest < yFrom) {
			direction = 315; // 135
		}

		return direction;
	}

	/**
	 * Moves to the next location of the square.
	 */
	@Override
	public void act() {
		
		if (flowers > winFlower) {
			this.setColor(new Color(0, 255, 0));
			return;
		}

		Location loc = getLocation();
		Grid<Actor> grid = getGrid();
		ArrayList<Actor> neighbors = grid.getNeighbors(loc);
		int[] directions = { 0, 45, 90, 135, 180, 225, 270, 315 };
		int randDirection = directions[new Random().nextInt(directions.length - 1)];

		System.err.printf("Bug = col(%d), row(%d), direction(%s) neighbors(%d)\n", loc.getCol(), loc.getRow(), loc.toString(), neighbors.size());

		for (int i = 0; i < neighbors.size(); i++) {
			Actor actor = neighbors.get(i);
			if (actor == null) {
				continue;
			}
			if (actor.getLocation() == null) {
				continue;
			}

			if (actor instanceof Flower) {
				// we found a Flower
				int direction = direction(loc, actor.getLocation());
				System.err.println("Flower direction: " + direction);
				setDirection(direction);
				break;
			}
		}
		
		if (neighbors.size() == 0) {
			System.err.println("Setting random direction");
			this.setDirection(randDirection);
		}
		
		if (this.canMove()) {
			this.move();
		} else {
			this.turn();
		}

//		
//		if (flowers > winFlower) {
//			this.setColor(new Color(0, 255, 0));
//			return;
//		}
//		
//		Location loc = getLocation();
//		Grid<Actor> grid = getGrid();
//		ArrayList<Actor> neighbors = grid.getNeighbors(loc);
//		list = getGrid().getOccupiedLocations();
//		System.out.println("list  = " + list.get(0));
//		
//		for (int i=0; i<neighbors.size() && this.canMove(); i++) {
//			Actor actor = neighbors.get(i);
//			if (actor == null) {
//				continue;
//			}
//			if (actor.getLocation() == null) {
//				continue;
//			}
//			if (actor instanceof Flower) {
//				// we found a Flower
//				int direction = direction(loc, actor.getLocation());
//				setDirection(direction);
//				break;
//			}
//		}
//		
//		if (steps < sideLength && canMove()) {
//			move();
//			//steps++;
//		} else {
//			for (int k = 0; k < (int) (Math.random() * 8); k++) {
//				turn();
//			}
//			steps = 0;
//		}
		
		
		
		
	}

}
