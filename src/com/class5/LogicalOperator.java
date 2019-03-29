package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// ask a user daily sales;
		// commission is based on sales;
		// if sales is less than 100 --> commission=2%
		// if sales are more than 100 and less than 200 --> commission=5%
		
		Scanner scan;
		int sales;
		int commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales");
		sales=scan.nextInt();
		
		if (sales>0 && sales<100) {
			commission=2;
		} else if (sales>=100 && sales<200) {
			commission=5;
		} else if (sales>=200 && sales<500) {
			commission=10;
		} else if (sales>=500) {
			commission=20;
		} else {
			commission=0;
		}
		System.out.println("Your commission is "+commission);
	}

}
