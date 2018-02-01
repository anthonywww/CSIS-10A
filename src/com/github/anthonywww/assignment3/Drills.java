package com.github.anthonywww.assignment3;

/**
 * Drills class
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/1/2018
 */
public class Drills {

	public static void main(String[] args) {
		
		/*
		 * Ex A: write a void method, paycheck, below main that calculates and
		 * prints a worker's paycheck, given the number of hours, and pay rate
		 */
		payCheck(40, 7.75);
		payCheck(20, 9.25);
		payCheck(50, 12.50);
        
        
		/*
		 * Ex B: write a void method volume below main that calculates and
		 * prints the volume of a cylinder, given the radius and height
		 */
		volume(0.5, 3);
		volume(2, 2);
		volume(5, 1);
        
        
        
		/*
		 * Ex C: write a void method feetAndInches below main that calculates
		 * and prints the number of feet and inches in a given number of
		 * inches
		 */
		feetAndInches(40);
		feetAndInches(83);
		feetAndInches(5);

        
		/*
		 * Ex D: write a void method averageSale below main that calculates
		 * and prints the the average sale of a comic book sold at
		 * a convention
		 */
		averageSale(500, 47);
		averageSale(434, 13);
		averageSale(122, 15);
    }
    
    
    // Define method paycheck here
    public static void payCheck(int hours, double rate) {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	
    	System.out.printf("%s: Worked %d hour(s) at a rate of %.2f for a total pay of $%.2f\n", methodName, hours, rate, (hours * rate));
    }
    
    // Define method volume here
    public static void volume(double radius, int height) {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	// Not as efficient as just doing (radius*radius) b/c calling a method
    	double area = Math.PI * Math.pow(radius, 2) * height;
    	
    	System.out.printf("%s: Radius of %.2f with a height of %d provides the volume %.3f\n", methodName, radius, height, area);
    }
    
    // Define method feetAndInches here
    public static void feetAndInches(int inches) {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	int feet = (inches/12);
    	int leftOverInches = (inches - feet * 12);
    	
    	System.out.printf("%s: %d inches is %d feet and %d inche(s)\n", methodName, inches, feet, leftOverInches);
    }
    
    // Define method averageSale here
    public static void averageSale(double revenue, int sold) {
    	String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
    	double averageSale = (revenue / sold);
    	
    	System.out.printf("%s: Sold %d comics for $%.2f for a average sale of %.3f\n", methodName, sold, revenue, averageSale);
    }

    
}
