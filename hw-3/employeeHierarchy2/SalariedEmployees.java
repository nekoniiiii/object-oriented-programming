package com.employeeHierarchy;

public class SalariedEmployees extends Employee {
	private double salary;
	
	public SalariedEmployees(String firstName, String lastName, String socialSecurityNumber, double salary) {
		super(firstName, lastName, socialSecurityNumber);
        setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative!");
        else
            this.salary = salary;
	}
	
	public String toString(){
        return String.format(super.toString() + "\nSalary: " + getSalary() + "\n");
	}
}
