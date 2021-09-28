package com.heartRatesClass;
import java.util.Scanner;

public class HeartRatesTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan nama depan: ");
        String firstName = scan.nextLine();
        System.out.println("Masukkan nama belakang: ");
        String lastName = scan.nextLine();
        System.out.println("Masukkan tanggal lahir (hari bulan tahun): ");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
		
		HeartRates person = new HeartRates(firstName, lastName, month, day, year);
		
		System.out.println("Data");
		System.out.println("Nama lengkap: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("Tanggal lahir: " + person.getDayBirth() + "/" + person.getMonthBirth() + "/" + person.getYearBirth());
		System.out.println("Usia: " + person.age() + " tahun");
		System.out.println("Detak jantung maksimum: " + person.maxRate() + " detak per menit");
		person.targetRate();
		
		scan.close();
	}

}
