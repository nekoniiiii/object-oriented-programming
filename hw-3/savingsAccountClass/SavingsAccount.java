package com.savingsAccountClass;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount (double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance*(annualInterestRate/12);
		savingsBalance += monthlyInterest;
	}
	
	public static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	public String toString(){
	    return String.format("	Savings balance: " + savingsBalance + "\n");
	 }
}
