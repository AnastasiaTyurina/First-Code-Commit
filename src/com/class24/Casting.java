package com.class24;

public class Casting {

	public static void main(String[] args) {
		// Implicit (automatic) casting / Widening
		double a=10;
		System.out.println(a);

		// Explicit (manual) casting / Narrowing
		double b=10.0;
		int c=(int)b;
		System.out.println(c);
		
		int i=130;
		byte by=(byte)i;
		System.out.println(by);
		
		// Upcasting
		Payment pay=new MasterCard();
		
		// Downcasting
		//MasterCard mc=(MasterCard)new Payment();
		
	}

}
