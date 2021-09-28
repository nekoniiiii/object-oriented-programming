package com.invoiceClass;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice cereal = new Invoice("026392", "Yellow stars cereal", 3, 25.0);
		Invoice milk = new Invoice("086438", "Strawberry milk", 7, 5.5);
		Invoice biscuit = new Invoice("099937", "Round choco biscuit", 15, 11.25);
		Invoice candy = new Invoice("025209", "50 mint candies", -22, 0.5);
		
		System.out.println("Cereal num: " + cereal.getNum());
		System.out.println("Biscuit desc: " + biscuit.getDesc());
		
		milk.setNum("013953");
		
		System.out.println("Milk num: " + milk.getNum());
		System.out.println("Candy invoice amount = " + candy.getInvoiceAmount());
		System.out.println("Milk invoice amount = " + milk.getInvoiceAmount());
	}

}
