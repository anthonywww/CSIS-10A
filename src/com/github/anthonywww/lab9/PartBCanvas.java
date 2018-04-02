package com.github.anthonywww.lab9;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JFrame;

/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Adapted from http://en.wikibooks.org/wiki/Java_Programming/Canvas
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */
public class PartBCanvas extends Canvas { // PartBCanvas is a kind of Canvas
											// that we can draw our own pictures
											// on
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// Create a JFrame object, which is a window that can contain the
		// canvas,
		// buttons, menus, and other window components;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add the canvas
		// Canvas class is used to create an area in a frame to be
		// used for displaying graphics.
		Canvas canvas = new PartBCanvas(); // Create a Canvas object called
											// canvas
		canvas.setSize(400, 400); // Set the size of our canvas
		frame.getContentPane().add(canvas);// Add our canvas to the JFrame
											// object

		// Display the frame on the screen.
		frame.pack();
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		/*
		// draw a line
		g.drawLine(10, 20, 100, 200); // from (10,20) to (100,200)

		// draw a filled rectangle
		g.fillRect(50, 100, 20, 40); // 20x40 at upper left corner (50,100)

		// draw a filled oval
		g.setColor(Color.green); // change color
		g.fillOval(50, 100, 20, 40); // green oval in black rectangle

		// draw a border line
		g.setColor(Color.red); // change color
		g.drawRect(50, 100, 20, 40); // red outline on black rectangle

		// use a rectangle object to draw an oval
		Rectangle box = new Rectangle(100, 100, 30, 30);
		g.fillOval(box.x, box.y, box.width, box.height);

		// move rectangle
		box.translate(30, 0);
		draw(g, box); // use a homemade method to save typing
		 */
		// use a loop to draw a row of 10 red balls, translate 40 between balls

		// use a nested loop to draw a 10 by 10 grid of red balls

		// make a polygon and draw it
		/*
		Polygon p = new Polygon();
		p.addPoint(10, 20);
		p.addPoint(10, 40);
		p.addPoint(50, 60);
		g.setColor(Color.blue);
		g.drawPolygon(p);
		*/

		// write a method that takes a Graphics g and a Rectangle object
		// and draws an X connecting the corners of the rectangle
		// then run these lines
		//
		// g.setColor(Color.violet);
		// crissCross(g, box);
		
		
		g.setColor(Color.black);
		g.fillOval(100, 100, 200, 200);
		g.setColor(Color.white);
		g.fillOval(150, 150, 100, 100);
		g.drawLine(0,0,400,400);
		g.drawLine(400,0,0,400);
		Polygon shape = new Polygon();
		shape.addPoint(0,0); 
		shape.addPoint(100, 0); 
		shape.addPoint(50, 50); 
		g.drawPolygon(shape);

	}

	public void draw(Graphics g, Rectangle b) {
		g.fillOval(b.x, b.y, b.width, b.height);
	}

}
