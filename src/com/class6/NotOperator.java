package com.class6;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		// not operator !
		// reverses condition
		
		boolean a=!true;
		System.out.println("The value of boolean variable is "+a);
		
		boolean snow=true;
		
		if(!snow) {
			System.out.println("I will stay home");
		}
		
		int x=10;
		int y=20;
		if (!(x>y)	) {
			System.out.println("x is larger than y");
		}
	
		int num1, num2, num3, largest =0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 different  numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(!(num1==num2 && num2==num3 && num1==num3)) {
			if(num1>num2) {
				if(num1>num3) {
					largest=num1;
				}else {
					largest=num3;
				}
			}else {
				if (num2>num3) {
					largest=num2;
				}else {
					largest=num3;
				}
			}
		}else {
			System.out.println("All number are equal");
		}
		System.out.println("The largest number is "+largest);
		
	}

}
