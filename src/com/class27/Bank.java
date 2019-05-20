package com.class27;

public interface Bank {
	// the methods are public and abstract by default
	// cannot have static methods
	void hasChecking();
	void hasSAvings();
	void hasCreditCard();
	
	static String name="Bank";
	// all variables are public, static and final by default ==> all variables are constant
	// cannot have instance variables
	// constructor is prohibited in interface
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");	
	}

	@Override
	public void hasSAvings() {
		System.out.println("BOA has 2 savings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BAO has 10 different credit cards");
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
		
	}

	@Override
	public void hasSAvings() {
		System.out.println("PNC has 3 saving accounts");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different credit cards");
		
	}
	
}