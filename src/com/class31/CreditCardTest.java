package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard visa=new Visa("Visa Platinum");
		
		CreditCard amex=new Amex("American Express Rewards");
		
		CreditCard masterCard=new MasterCard("Master Card Basic");
		
		ArrayList<CreditCard> alist=new ArrayList<>();
		alist.add(visa);
		alist.add(amex);
		alist.add(masterCard);
		
		for(CreditCard list:alist) {
			System.out.println(list.creditCardName);
			list.interestRate();
			list.annualFee();
		}
		Iterator <CreditCard>myIterator=alist.iterator();
		while(myIterator.hasNext()) {
			CreditCard obj=myIterator.next();
			obj.interestRate();
		}
		for(int i=0; i<alist.size(); i++) {
			CreditCard obj=alist.get(i);
			obj.annualFee();
		}
		}

}
