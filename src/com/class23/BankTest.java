package com.class23;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		BankOfAmerica boa=new BankOfAmerica();
		PNC pnc=new PNC();
		
		System.out.println(bank.chargeInterest());
		System.out.println(boa.chargeInterest());
		System.out.println(pnc.chargeInterest());
		
	}

}
