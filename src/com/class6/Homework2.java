package com.class6;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// same as homework but different solution
		double num1, num2, num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 different double values");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("First number is the largest");
			} else {
				System.out.println("Third number is the largest");
			}
		} else if (num2>num1) {
			if (num2>num3) {
				System.out.println("Second number is the largest");
			} else {
				System.out.println("Third number is the largest");
			}
		} 
	}

}
