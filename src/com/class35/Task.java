package com.class35;

public class Task {

	public static void main(String[] args) {
		
		withdraw(10000);
		withdraw(50000);
		withdraw(100000);
		
	}
	public static void withdraw(int amount) {
		int balance=50000;
		if(amount<=balance) {
			System.out.println("Please collect your money");
		}else {
			throw new ArithmeticException("Insufficient funds");
		}
	}

}
