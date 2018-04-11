package com.github.anthonywww.lab11;

import java.util.Scanner;

/**
 * class StudentTestApplication demonstrates use of 
 *   the Student class
 *    
 *   this is Lab 11 Part A.2
 */

public class StudentTestApp
{
    public static void main(String[] args){
        System.out.println("\f");  // start with blank screen
        
        // BEFORE BEGINNING, add the SET methods to the Student class
        //**************** Problem 1 ********************
        // Create three Student objects, 
        //    one with the default (no-arg) constructor
        //    two with the explicit (overloaded) constructor
        //      (make up your own names, units, GPA for 2 fictitious students
        Student a = new Student();
        Student b = new Student("er", "Test", 10, 4.0);
        Student c = new Student("user", "L", 8, 3.5);
        // Then print out the data in all three of your objects
        a.print();
        b.print();
        c.print();
        
        
        //**************** end Problem 1 *****************/
        //**************** Problem 2 ********************
        // Write an if-else statement that compares the GPA of 
        //   your two fictitious students and prints the name of 
        //   the student with the higher GPA
       	
        if (a.getTotalGPA() > b.getTotalGPA() && a.getTotalGPA() > c.getTotalGPA()) {
        	a.print();
        } else if (b.getTotalGPA() > a.getTotalGPA() && b.getTotalGPA() > c.getTotalGPA()) {
        	b.print();
        } else {
        	c.print();
        }
        
        //**************** end Problem 2 *****************/
        //**************** Problem 3 ********************
        // Write statements where indicated using the appropriate
        //   set and get methods to assign Kris Salerno's GPA 
        //   to Rye Chakos (it can actually be done with one 
        //   statement using composition)
                     
        Student stA = new Student("Salerno", "Kris", 10, 4.0);
        Student stB = new Student("Chakos", "Rye", 50, 3.5);
        
        System.out.print("original info in stA = \n  ");
        stA.print();
        System.out.print("original info in stB = \n  ");
        stB.print();
        
        // use set and get to copy Kris Salerno's GPA over 
        //   to Rye Chakos
        stB.setTotalGPA(stA.getTotalGPA());
        
        
        System.out.print("final info in stA = \n  ");
        stA.print();
        System.out.print("final info in stB = \n  ");
        stB.print();        
 
        
        //**************** end Problem 3 *****************/
        //**************** Problem 4 ********************
        // Write statements that read a complete set 
        //   of Student information from a Scanner into
        //   temporary local variables for (last and first) name, units and GPA
        //   then creates a new student object with that info 
        
        // a) declare local variables to store student info
        Student st = new Student();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        st.setFirstName(sc.next());
        
        System.out.print("Enter your last name: ");
        st.setLastName(sc.next());
        
        System.out.print("Enter your total units: ");
        st.setTotalUnits(sc.nextInt());
        
        System.out.print("Enter your GPA: ");
        st.setTotalGPA(sc.nextDouble());
        
        // b) read the student info from the keyboard into your local variables
        
        // c) create a new Student object with the info you just read
        
        // d) print the Student object you just created and verify
        
        sc.close();
        
        st.print();
                
        //**************** end Problem 4 *****************/   
        //**************** Problem 5 ********************
        // In THIS FILE, below the MAIN METHOD, 
        //   write a PUBLIC STATIC BOOLEAN method scholarshipWinner 
        //   that takes a Student object as a parameter. 
        //   
        //  this method returns true if the student has taken 
        //   more than 50 units and has a GPA larger than 3.5.
        
        // test your method by running the statements here
        Student studysAlot = new Student("Draper","Charlene", 55,4.0);
        Student workingAtIt = new Student("Princeton","Gointa",30,3.3);
        
        if (scholarshipWinner(studysAlot)){
            System.out.println("Congratulations to our new scholarship winner: ");
            studysAlot.print();
        }
        
        // add statements to determine whether workingAtIt gets a scholarship
        if (scholarshipWinner(workingAtIt)){
            System.out.println("Congratulations to our new scholarship winner: ");
            studysAlot.print();
        } else {
        	System.out.println("Working at it!");
        }
        
        //**************** end Problem 5 *****************/         
    } // end of main method
    
   public static boolean scholarshipWinner(Student student) {
	   return (student.getTotalGPA() > 3.5 && student.getTotalUnits() > 50);
   }
    
}
