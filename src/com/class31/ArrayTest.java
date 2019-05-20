package com.class31;

public class ArrayTest {

	public static void main(String[] args) {
		String a="A";
		String b=new String("B");
		
		int[] intArray= {10, 21, 34};
		String[] stringArray= {"Hello","Bye"};
		
		Visa visa1=new Visa("Visa Platinum");
		Visa visa2=new Visa("Visa Platinum");
		Visa visa3=new Visa("Visa Platinum");
		
		Amex ax1=new Amex("American Express Rewards");
		Amex ax2=new Amex("American Express Rewards");
		Amex ax3=new Amex("American Express Rewards");
		
		CreditCard[] visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};
		
		Object[] objectArray= {visa1, ax1, "John", 67, true, 90.08};
		
	}

}
