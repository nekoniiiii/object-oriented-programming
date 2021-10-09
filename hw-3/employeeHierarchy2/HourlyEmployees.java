package com.employeeHierarchy;

public class HourlyEmployees extends Employee {
	private double hours;
	private double wage;
	
	public HourlyEmployees(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours > 168.0  || hours < 0.0)
            throw new IllegalArgumentException("Working hour(s) must be in between 0 and 168");
        else
            this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage < 0)
            throw new IllegalArgumentException("Wage cannot be negative!");
        else
            this.wage = wage;
	}
	
	public double earnings() {
		
		if(hours > 40.0)
			return getWage()*40.0 + 1.5*getWage()*(getHours()-40.0);
		else
			return getWage()*getHours();
		
	}
	
	public String toString(){
        return String.format(super.toString() + "\nWage per hour: " + getWage() + "\nWorking hour(s): " + getHours() + "\nEarnings: " + earnings() + "\n");
    }
}
