package com.class23;

public class Bank {

	public int chargeInterest() {
		return 0;
	}
}

class BankOfAmerica extends Bank{
	@Override //annotation
	public int chargeInterest() {
		return 2;
	}
}

class PNC extends Bank{
	
	public int chargeInterest() {
		return 3;
	}
}
