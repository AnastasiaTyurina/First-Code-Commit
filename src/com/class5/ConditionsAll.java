package com.class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		// ask user to enter price and boolean value for sale;
		// based on the sale, we will check the price 
		// if price is less than $20, we will apply a 20% discount and give final price
		// if price is more than $20 but less than $100, we will apply a 30% discount
		// if price is more than $100 but less than $500, we will apply 50% discount
		
		boolean sale=true;
		int discount;
		int price;
		double finalPrice;
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale? true/false");
		sale=scan.nextBoolean();
		
		
		if(sale) {
			System.out.println("What is the price of the item?");
			price=scan.nextInt();
		    if(price<20) {
			discount=20;
			finalPrice=price-(price*0.2);
			System.out.println("Your final price is "+finalPrice);
			}else if (price>=20 && price<100) {
			discount=30;
			finalPrice=price-(price*0.3);
			System.out.println("Your final price is "+finalPrice);
			}else if (price>=100 && price<500) {
			discount=50;
			finalPrice=price-(price*0.5);
			System.out.println("Your final price is "+finalPrice);
			}else {
				System.out.println("Invalid number");
			}
		} else {
				System.out.println("No sale = No discount");
		} 
	}

}
