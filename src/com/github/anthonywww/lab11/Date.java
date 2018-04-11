package com.github.anthonywww.lab11;

public class Date {

	private int year, month, day;

	public Date() {
		// Calendar cal = Calendar.getInstance();
		year = 2000;// cal.get(Calendar.YEAR);
		month = 1;// cal.get(Calendar.MONTH);
		day = 1;// cal.get(Calendar.DAY_OF_MONTH);
	}

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 32) {
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}
	
	public void print() {
		System.out.printf("%d/%d/%d\n", month, day, year);
	}
}
