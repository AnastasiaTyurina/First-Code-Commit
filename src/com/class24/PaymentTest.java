package com.class24;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();

		VisaCard visa=new VisaCard();
		visa.makePayment();
		visa.annualFee();
		// achieving run time polymorphism
		Payment pay=new MasterCard();
		pay.closePayment();
		pay.makePayment();
		
		Payment pay1=new VisaCard();
		pay1.closePayment();
		pay1.makePayment();
		
	}

}
