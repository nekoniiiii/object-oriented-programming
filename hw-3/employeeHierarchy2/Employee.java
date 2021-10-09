package com.employeeHierarchy;

public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("Name: " + getFirstName() + " " + getLastName() + "\nSocial security number: " + getSocialSecurityNumber());
	}
	
}
