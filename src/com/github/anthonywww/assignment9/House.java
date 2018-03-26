package com.github.anthonywww.assignment9;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * AWT House Test
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/25/2018
 */
public class House extends Canvas {

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
		Canvas canvas = new House(); // Create a Canvas object called canvas
		canvas.setSize(700, 500); // Set the size of our canvas
		frame.getContentPane().add(canvas);// Add our canvas to the JFrame object

		// Display the frame on the screen.
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// draw a blue circle
		//Rectangle box = new Rectangle(100, 100, 30, 30);
		//g.setColor(Color.BLUE);
		//g.fillOval(box.x, box.y, box.width, box.height);
		
		
		int rows = 4;
		int columns = 5;
		int multiplierX = 150;
		int multiplierY = 100;
		int houseWidth = 80;
		int houseHeight = 50;
		
		// Hauses
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				house(g, new Rectangle(i*multiplierX + 20, j*multiplierY + 50, houseWidth, houseHeight));
			}
		}
		
		
	}
	
	private static void house(Graphics g, Rectangle rect) {
		
		// Draw frame
		g.setColor(Color.YELLOW);
		g.fillRect(rect.x, rect.y, rect.width, rect.height);
		
		// Draw roof
		g.setColor(Color.RED);
		Polygon poly = new Polygon();
		poly.addPoint(rect.x, rect.y);
		poly.addPoint(rect.x + (rect.width/2), rect.y - (30 + rect.height/5));
		poly.addPoint(rect.x + rect.width, rect.y);
		g.fillPolygon(poly);
		
		// Draw windows
		g.setColor(Color.GREEN);
		g.fillRect(rect.x + 10, rect.y + 15, rect.width/5, rect.height/5);
		g.fillRect((rect.x + rect.width) - (rect.width/5 + 10), rect.y + 15, rect.width/5, rect.height/5);
		
		// Draw door
		g.setColor(Color.BLUE);
		g.fillRect((rect.x + (rect.width/2))-(rect.width/10), (rect.y + rect.height/2) + 10, rect.width/6+4, rect.height/4+3);
	}
	
	
}
