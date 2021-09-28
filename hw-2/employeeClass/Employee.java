package com.employeeClass;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSalary(monthlySalary);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public double getSalary() {
		return this.monthlySalary;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setSalary(double monthlySalary){
		if (monthlySalary >= 0) this.monthlySalary = monthlySalary;
	}
	
	public double annualSalary() {
		return getSalary()*12;
	}
	
	public double raise() {
		double raisedSalary = getSalary()*1.1;
		setSalary(raisedSalary);
		return raisedSalary;
	} 
}
