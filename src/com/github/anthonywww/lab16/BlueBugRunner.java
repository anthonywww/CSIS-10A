package com.github.anthonywww.lab16;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;

public class BlueBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		BlueBug alice = new BlueBug();
		alice.setColor(Color.blue);
		world.add(alice);

		for (int i = 0; i < 5; i++) {
			world.add(new Rock());
		}
		world.show();
	}
}