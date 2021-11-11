package com.employeeHierarchy;

public class PieceWorkerTest {

	public static void main(String[] args) {
		PieceWorker employee1 = new PieceWorker("Nii", "Nekoo", "887434", 500, 0.5);
		CommissionEmployee employee2 = new CommissionEmployee("Sarah", "All", "1345234", 4000.0, 0.66);
		BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee("Ina", "Ai", "1345234", 5000.0, 0.5, 15000.0);
		
		Employee[] employees = new Employee[3];
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		for (Employee currentEmployee: employees) {
			System.out.println(currentEmployee);
		}
		
	}

}
