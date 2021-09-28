package com.dateClass;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date(11, 28, 21);
		
		System.out.println("Today's date: ");
		today.displayDate();
		
		int tomorrow = today.getDay() + 1;
		today.setDay(tomorrow);
		
		System.out.println("Tomorrow's date: ");
		today.displayDate();
	}

}
