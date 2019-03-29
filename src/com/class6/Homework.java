package com.class6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// find the largest of 3 value given by a user
		int num1;
		int num2;
		int num3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		System.out.println("Please enter third number");
		num3=scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("First number is the largest of the three");
		} else if (num2>num1 && num2>num3) {
			System.out.println("Second number is the largest of the three");
		} else {
			System.out.println("Third number is the largest of the three");
		}
		
	}

}
