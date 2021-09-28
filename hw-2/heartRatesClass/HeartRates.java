package com.heartRatesClass;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int monthBirth, dayBirth, yearBirth;
	
	public HeartRates(String firstName, String lastName, int monthBirth, int dayBirth, int yearBirth) {
		setFirstName(firstName);
		setLastName(lastName);
		setMonthBirth(monthBirth);
		setDayBirth(dayBirth);
		setYearBirth(yearBirth);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getMonthBirth() {
		return this.monthBirth;
	}
	
	public int getDayBirth() {
		return this.dayBirth;
	}
	
	public int getYearBirth() {
		return this.yearBirth;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setMonthBirth(int monthBirth) {
		if(monthBirth < 1 || monthBirth > 12)
			throw new IllegalArgumentException("Month must be in range 1-12!");
		else 
			this.monthBirth = monthBirth;
	}
	
	public void setDayBirth(int dayBirth) {
		if(getMonthBirth() == 2 && dayBirth > 29)
			throw new IllegalArgumentException("February cannot have days more than 29!");
		else if(((getMonthBirth() == 4) || (getMonthBirth() == 6) || (getMonthBirth() == 9) || (getMonthBirth() == 11)) && (dayBirth > 30))
			throw new IllegalArgumentException("The month cannot have days more than 30!");
		else if (((getMonthBirth() == 1) || (getMonthBirth() == 3) || (getMonthBirth() == 5) || (getMonthBirth() == 7) || (getMonthBirth() == 8) || (getMonthBirth() == 10)|| (getMonthBirth() == 12)) && (dayBirth > 31))
			throw new IllegalArgumentException("The month cannot have days more than 31!");
		else
			this.dayBirth = dayBirth;
	}
	
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	public int age() {
		// dihitung dari akhir sept
		if(getMonthBirth() > 9) {
			return 2020 - this.yearBirth;
		}
		else {
			return 2021 - this.yearBirth;
		}
	}
	
	public int maxRate() {
		return 220 - age();
	}
	
	public void targetRate() {
		 System.out.println("Target rentang detak jantung: " + maxRate()*0.5 + " sampai " + maxRate()*0.85 + " detak per menit");
	}
}
