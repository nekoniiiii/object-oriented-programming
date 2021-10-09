package com.employeeHierarchy;

public class BasePlusCommissionEmployeeTest {
	
	public static void main(String[] args) {
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Neko", "Nii", "1345234", 5000.0, 0.5, 15000.0);
		System.out.print(employee1.toString());
		System.out.print("\nEarning: " + employee1.earning());
	}
	
}