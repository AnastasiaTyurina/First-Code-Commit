package com.JavaReview;

public class Practice3 {

	public static void main(String[] args) {
		
		int a=333;
		int num1=0, num2=0, num3=0;
		
			num1=a%10;
			num2=a/10;
			num3=num2/10;
			num2=num2%10;
			
		System.out.println(num1+num2+num3);
	}

}
