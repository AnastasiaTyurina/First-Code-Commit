package com.class8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan;
		double price;
		scan=new Scanner(System.in);
		do {
			System.out.println("pay for soda");
			price=scan.nextDouble();
		} while (price!=1.99);
		System.out.println("enjoy your soda");
		
	}

}
