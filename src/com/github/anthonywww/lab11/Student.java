package com.github.anthonywww.lab11;

/**
 * class Student represents students at a school
 * 
 */
public class Student {
	
	private String lastName, firstName;
	private int totalUnits;
	private double totalGPA;

	public Student() {
		this.lastName = "xxxx";
		this.firstName = "xxxx";
		this.totalUnits = 0;
		this.totalGPA = 0;
	}

	public Student(String lastName, String firstName, int totalUnits, double totalGPA) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.totalUnits = totalUnits;
		this.totalGPA = totalGPA;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setTotalUnits(int totalUnits) {
		this.totalUnits = totalUnits;
	}

	public int getTotalUnits() {
		return totalUnits;
	}
	
	public void setTotalGPA(double d) {
		this.totalGPA = d;
	}

	public double getTotalGPA() {
		return totalGPA;
	}

	// add the set methods here

	public void print() {
		System.out.println("Name: " + lastName + ", " + firstName + ", Units: " + totalUnits + ", GPA: " + totalGPA);
	}

}
