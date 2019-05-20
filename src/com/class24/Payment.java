package com.class24;

public class Payment {

	public void makePayment() {
		System.out.println("We can make a payment with no fee");
	}
	public void closePayment() {
		System.out.println("All payments need to be closed");
	}
}
class MasterCard extends Payment{
	public void makePayment() {
		System.out.println("We can make payment with MC and 2% fee");
	}
}
class VisaCard extends Payment{
	public void makePayment() {
		System.out.println("We can make payment with Visa and 1.5% fee");
	}
	public void annualFee() {
		System.out.println("Visa card has annual fee");
	}
}