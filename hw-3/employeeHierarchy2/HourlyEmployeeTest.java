package com.employeeHierarchy;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee employee1 = new HourlyEmployee("Neko", "Nii", "1345234", 166.0, 1000.0);
		SalariedEmployees employee2 = new SalariedEmployees("Nii", "Nei", "34352432", 1000.5464);
		PieceWorkers employee3 = new PieceWorkers("Nii", "Nekoo", "887434", 500, 0.5);
		HourlyEmployees employee4 = new HourlyEmployees("Niisan", "Neko", "2435452", 100.0, 100.0);
		
		System.out.println(employee1.toString());
		System.out.println("===================================\n");
		System.out.println(employee2.toString());
		System.out.println("===================================\n");
		System.out.println(employee3.toString());
		System.out.println("===================================\n");
		System.out.println(employee4.toString());
	}

}
