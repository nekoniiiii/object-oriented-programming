package com.invoiceClass;

public class Invoice {
	private String num;
	private String desc;
	private int quantity;
	private double price;
	
	public Invoice(String num, String desc, int quantity, double price) {
    setNum(num);
    setDesc(desc);
    setQuantity(quantity);
    setPrice(price);
	}
	
	public String getNum() {
		return this.num;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setNum(String num){
		this.num = num;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public void setQuantity(int quantity){
		if (quantity>0) this.quantity = quantity;
		else this.quantity = 0;
	}

	public void setPrice(double price){
		if (price>0.0) this.price = price;
		else this.price = 0.0;
	}	
	
	public double getInvoiceAmount() {
		return getQuantity()*getPrice();
	}
}
