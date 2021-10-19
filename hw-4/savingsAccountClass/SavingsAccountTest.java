package com.savingsAccountClass;

public class SavingsAccountTest {
	
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		displayWholeYear(saver1);
		displayWholeYear(saver2);
		
		SavingsAccount.modifyInterestRate(0.05);
		
		displayPerMonth(saver1);
		displayPerMonth(saver2);
	}
	
	public static void displayWholeYear(SavingsAccount account){
		for(int start=1; start <= 12; start++){
			account.calculateMonthlyInterest();
			System.out.printf("For month " + start + account);
		}
	}
	
	public static void displayPerMonth(SavingsAccount account){
		account.calculateMonthlyInterest();
		System.out.printf("For next month " + account);
	}
}
