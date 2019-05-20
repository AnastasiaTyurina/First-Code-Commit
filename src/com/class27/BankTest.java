package com.class27;

public class BankTest {
	
	public static void main(String[] args) {

	Bank bank1=new BOA();
	bank1.hasChecking();
	bank1.hasSAvings();
	bank1.hasCreditCard();
	
	Bank bank2=new PNC();
	bank2.hasChecking();
	bank2.hasSAvings();
	bank2.hasCreditCard();
}
}
