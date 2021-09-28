package com.employeeClass;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee Lara = new Employee("Larasati", "Rini", 3.5);
		Employee Natsu = new Employee("Natsu", "Kujou", 15.566);
		
		// gaji tahunan tiap pegawai
		System.out.println("Gaji Lara adalah " + Lara.annualSalary() + " juta rupiah per tahun");
		System.out.println("Gaji Natsu adalah " + Natsu.annualSalary() + " juta rupiah per tahun");
		
		// setelah naik 10%
		Lara.raise();
		Natsu.raise();
		
		System.out.println("Gaji Lara setelah naik adalah " + Lara.annualSalary() + " juta rupiah per tahun");
		System.out.println("Gaji Natsu setelah naik adalah " + Natsu.annualSalary() + " juta rupiah per tahun");
	}
	
}
