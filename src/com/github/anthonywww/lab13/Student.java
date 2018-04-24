package com.github.anthonywww.lab13;

/**
 * class Student represents students at a school
 * 
 */
public class Student {
	// instance variables
	private String lastName, firstName;
	private int totalUnits;
	private double totalGPA;

	// default constructor
	public Student() {
		this.lastName = "xxxx";
		this.firstName = "xxxx";
		this.totalUnits = 0;
		this.totalGPA = 0;
	}

	// explicit constructor (overloading the default constructor)
	public Student(String lastName, String firstName, int totalUnits, double totalGPA) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.totalUnits = totalUnits;
		this.totalGPA = totalGPA;
	}

	// ACCESSOR METHODS
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getTotalUnits() {
		return totalUnits;
	}

	public double getTotalGPA() {
		return totalGPA;
	}

	// MODIFIER METHODS
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setTotalUnits(int totalUnits) {
		this.totalUnits = totalUnits;
	}

	public void setTotalGPA(double totalGPA) {
		this.totalGPA = totalGPA;
	}

	public void print() {
		System.out.println("Name: " + lastName + ", " + firstName + ", Units: " + totalUnits + ", GPA: " + totalGPA);
	}

}
