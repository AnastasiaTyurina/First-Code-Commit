package com.class35;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);
		
		check(50);
		
		division(10, 10);
		
		checkLength("asd");
		
	}
	public static void check(int age) {
		if (age>=18) {
			System.out.println("Congratulations on your driver's license");
		}else {
			throw new ArithmeticException("You are not eligible to get driver's license");
		}
	}
	public static void division(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("Cannot divide by 0");
		}
	}
	public static void checkLength(String userName) {
		if(userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("Username must be longer than 3 characters");
		}
	}
}
