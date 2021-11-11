package com.employeeHierarchy;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

	public double getBaseSalary() {
		if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary cannot be empty!");
		else
			return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		
		this.baseSalary = baseSalary;
	}
	
	public double earning() {
		return getBaseSalary() + super.earnings();
	}
	
	public String toString() {
		return String.format(super.toString() + "Base salary: " + getBaseSalary() + "\nNew earnings: " + earning() + "\n");
	}
}
