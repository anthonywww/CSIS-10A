package com.github.anthonywww.lab11;

/**
 * class DateTestApp tests your new Date class by creating objects and trying
 * out the object methods on them
 * 
 * This is Lab 11 Part A.1
 * 
 * Please refer to the Time.java and TimeTestApp.java classes while working on
 * these
 */
public class DateTestApp {
	
	public static void main(String[] args) {

		//Date d = new Date();
		//System.out.println("d = " + d.month + "/" + d.day + "/" + d.year);
		
		
        // Define the "No-Arg" (Default) Constructor in the Date class to set
        //   the default Date to 1/1/2000
        // 
        // Re-run Problem 1 and observe the change in the different fields 

		
        //**************** Problem 3 ********************
        // Define the "Overloaded" (Explicit) Constructor in the Date class to 
        //   be able to create a date object with initial values.
        
        // create a new Date object initialized to the date of your birth 
        //  and store a reference to it in variable birthday 
        //  then print out the values in your birthday object
        //Date d2 = new Date(6, 30, 1998);
        //System.out.printf("d2 = %d/%d/%d\n", d2.month, d2.day, d2.year);
		
        // create a new Date object for an upcoming holiday
        //  and print it
        //Date d3 = new Date(12, 25, 2018);
        //System.out.printf("d3 = %d/%d/%d\n", d3.month, d3.day, d3.year);
             
        //**************** end Problem 3 *****************/
        
        
        
        //**************** Problem 4 ********************
        // In the Date class, add the word 'private' in front of the
        //   instance variable declarations
        // Add the getters and setters (getMonth, setMonth, etc) to Date class
        // Comment out Problems 1 - 3            
        // Then execute the statements that follow and verify the program
        //  works properly 
        
        Date appt = new Date(12,3,2014);
        System.out.println("Your appointment is on: " + appt.getMonth() + "/" 
                            + appt.getDay() + "/" + appt.getYear());        
        
        appt.setDay(10);
        appt.setMonth(11);
        appt.setYear(appt.getYear() + 1);
        
        System.out.println("Your appointment has been moved to: " 
                            + appt.getMonth() + "/" + appt.getDay() 
                            + "/" + appt.getYear());        
                
        //**************** end Problem 4 *****************/
        //**************** Problem 5 ********************
        // Default printing for Date objects only shows special Hex code 
        
        System.out.println("Your appointment is on " + appt);
        
        //**************** end Problem 5 *****************/
        //**************** Problem 6 ********************
        // Define a print method for Date objects and use that to print  
        
        System.out.print("Your appointment is on ");
        appt.print();

        //**************** end Problem 6 *****************/        

        
        
    }
}
