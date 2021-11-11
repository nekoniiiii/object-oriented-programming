package com.employeeHierarchy;

public class CommissionEmployee extends Employee{
	private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

	public double getGrossSales() {
		return this.grossSales;
	}

	public double getCommissionRate() {
		return this.commissionRate;
	}
	
	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales cannot be empty!");
        else
            this.grossSales = grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		if (commissionRate >= 1.0  || commissionRate <= 0.0)
            throw new IllegalArgumentException("Commission must be in range 0-1.");
        else
            this.commissionRate = commissionRate;
	}
    
	public double earnings() {
		return getCommissionRate()*getGrossSales();
	}
	
	public String toString(){
        return String.format(super.toString() + "\nGross sales: " + getGrossSales() + "\nCommission rate: " + getCommissionRate() + "\nEarnings: " + earnings() + "\n");
    }
}