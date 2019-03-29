package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// check if user has a credit card;
		// if yes, check the balance;
		// if balance is more than 1000 --> pay off immediately
		//if less than 1000 --> "You are good"
		
		boolean creditCard=true;
		int balance=1000;
		
		if(creditCard) {
			System.out.println("Let's check the balance");
			if(balance>=1000) {
				System.out.println("Pay it off immediately");
			} else if(balance==0) {
				System.out.println("Please use your card");
			} else {
				System.out.println("You are good");
			}
		} else {
			System.out.println("Do you want one?");
		}

	}

}
