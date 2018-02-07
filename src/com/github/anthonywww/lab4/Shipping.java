package com.github.anthonywww.lab4;

/**
 * Calculate shipping cost example
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/06/2018
 */
public class Shipping {

	public static void main(String[] args) {
		shippingCost(8, 20);
		shippingCost(4, 27);
		shippingCost(20, 6);
		shippingCost(1, 53);
		shippingCost(64, 81);
	}
	
	public static void shippingCost(int weight, int size) {
		double cost = 0.0;
		
		if (weight < 8) {
			cost = 5.5;
		} else if(weight < 16) {
			cost = 8.5;
		} else if(weight < 32) {
			cost = 12.0;
		} else {
			cost = weight/2.0;
		}
		
		if (size > 12 && size < 24) {
			cost += 2.0;
		}
		
		if (size >= 24) {
			cost += Math.pow(size, 0.3333);
		}
		
		System.out.printf("weight = %d, size = %d, cost = $%.2f\n", weight, size,   cost);
	}
	
}
