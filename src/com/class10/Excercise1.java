package com.class10;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		//program that reads a range of integers (start and end point) provided by a user 
		// print the sum of of even and odd numbers
		Scanner scan=new Scanner(System.in);
		int s;
		int f;
		int a;
		int sumOfEven=0;
		int sumOfOdd=0;
		
		System.out.println("Enter your start point");
		s=scan.nextInt();
		System.out.println("Enter your finish point");
		f=scan.nextInt();
		if(s<f) {
			for(a=s; a<=f; a++) {
				if(a%2==0) {
					sumOfEven+=a;
				}else {
					sumOfOdd+=a;
				}
				System.out.println("The sum of even numbers is "+sumOfEven);
				System.out.println("The sum of odd numbers is "+sumOfOdd);
				
	
		}
		}
	
	}
}



