// Nama: Neisa Hibatillah A.
// NRP: 5025201170
// Kelas PBO D

package com.calculator;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int hasil, num, op;
	    int it = 0;
	    char pilih = 'y';
	    
	    System.out.println("Masukkan dua buah angka: ");
	    hasil = scan.nextInt();
	    
	    while(pilih == 'y') {
	    	
	    	if(it>0) {
	    		/* pengulangan while yang akan berjalan lebih dari 1 kali 
	    		menggunakan hasil sebelumnya, maka jumlah bilangan yang 
	    		diinput selanjutnya hanya 1 */
	    		System.out.print("Masukkan sebuah angka: ");
	    	}
	    	num = scan.nextInt();
	    	
	    	System.out.println("Silakan pilih kode operator:" + 
								"\n1: Penambahan" +
								"\n2: Pengurangan" +
								"\n3: Perkalian" +
								"\n4: Pembagian" +
            					"\n5: Modulo\n");
	    	
	    	op = scan.nextInt();
	    	
	    	switch (op) {
	    	case 1:
	    		System.out.println(hasil + " + " + num);
	    		hasil = tambah(hasil, num);
	    		System.out.println(" = " + hasil);
		    	break;
	    	case 2:
	    		System.out.println(hasil + " - " + num);
	    		hasil = kurang(hasil, num);
	    		System.out.println(" = " + hasil);
		    	break;
	    	case 3:
	    		System.out.println(hasil + " x " + num);
	    		hasil = kali(hasil, num);
	    		System.out.println(" = " + hasil);
		    	break;
	    	case 4:
	    		System.out.println(hasil + " / " + num);
	    		hasil = bagi(hasil, num);
	    		System.out.println(" = " + hasil);
		    	break;
	    	case 5:
	    		System.out.println(hasil + " mod " + num);
	    		hasil = mod(hasil, num);
	    		System.out.println(" = " + hasil);
		    	break;
		     default:
		    	// jika variabel op (operator) yang diinput diluar 1-5
		    	System.out.print("Pilihan tidak ditemukan!");
			    break;
	    	}
	    	
	    	System.out.print("Apakah anda ingin melanjutkan menggunakan " +
	    					 "hasil sebelumnya? y/n\n");
		    pilih = scan.next().charAt(0);
		    it++;
	    }
	    scan.close();
	}
	
	public static int tambah(int a, int b) {
		return a+b;
	}
	
	public static int kurang(int a, int b) {
		return a-b;
	}
	
	public static int kali(int a, int b) {
		return a*b;
	}
	
	public static int bagi(int a, int b) {
		return a/b;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}
}