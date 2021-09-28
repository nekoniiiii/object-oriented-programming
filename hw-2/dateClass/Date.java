package com.dateClass;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12)
			throw new IllegalArgumentException("Month must be in range 1-12!");
		else 
			this.month = month;
	}
	
	public void setDay(int day) {
		if(getMonth() == 2 && day > 29)
			throw new IllegalArgumentException("February cannot have days more than 29!");
		else if(((getMonth() == 4) || (getMonth() == 6) || (getMonth() == 9) || (getMonth() == 11)) && (day > 30))
			throw new IllegalArgumentException("The month cannot have days more than 30!");
		else if (((getMonth() == 1) || (getMonth() == 3) || (getMonth() == 5) || (getMonth() == 7) || (getMonth() == 8) || (getMonth() == 10)|| (getMonth() == 12)) && (day > 31))
			throw new IllegalArgumentException("The month cannot have days more than 31!");
		else
			this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
	}
}
