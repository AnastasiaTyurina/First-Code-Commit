package com.class25;

public class BankTest {

	public static void main(String[] args) {
		
		BankA a=new BankA();
		a.getBalance();
		System.out.println(a.getBalance());
		
		BankB b=new BankB();
		b.getBalance();
		System.out.println(b.getBalance());
		
		BankC c=new BankC();
		c.getBalance();
		System.out.println(c.getBalance());
	}

}
