package com.github.anthonywww.lab9;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * Draws flags
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/31/2018
 */
public class DrawFlag extends Canvas {

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
		Canvas canvas = new DrawFlag();
		canvas.setSize(800, 500);
		frame.getContentPane().add(canvas);

		// Display the frame on the screen.
		frame.pack();
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		Rectangle canvas = new Rectangle(40, 20, 80, 50);
		
		canvas.setLocation(10, 10);
		
		for (int i = 0; i < 5; i++) {
			japaneseFlag(g, canvas);
			canvas.translate(100, 0);
		}
		
		canvas.setLocation(10, 80);
		
		for (int i = 0; i < 5; i++) {
			columbianFlag(g, canvas);
			canvas.translate(100, 0);
		}
		
	}

	public static Point findCenter(Rectangle rect) {
		int x = rect.x + rect.width / 2;
		int y = rect.y + rect.height / 2;
		return new Point(x, y);
	}

	private static void japaneseFlag(Graphics g, Rectangle canvas) {
		g.setColor(Color.BLACK);
		g.drawRect(canvas.x, canvas.y, canvas.width, canvas.height);
		g.setColor(Color.RED);
		int sunsize = 30;
		g.fillOval((canvas.x + (canvas.width / 2)) - sunsize / 2, (canvas.y + (canvas.height / 2)) - sunsize / 2, sunsize, sunsize);
	}
	
	private static void columbianFlag(Graphics g, Rectangle canvas) {
		g.setColor(Color.BLACK);
		g.drawRect(canvas.x, canvas.y, canvas.width, canvas.height);
		g.setColor(Color.YELLOW);
		g.fillRect(canvas.x, canvas.y, canvas.width, canvas.height/2);
		g.setColor(Color.BLUE);
		g.fillRect(canvas.x, canvas.y+(canvas.height/2), canvas.width, canvas.height/3);
		g.setColor(Color.RED);
		g.fillRect(canvas.x, canvas.y+(canvas.height/3), canvas.width, canvas.height/3);
	}

}
