package com.class10;

import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args) {
		// user has 10 chances to input leap year
		// exit the loop when the user guesses the correct leap year
		Scanner scan;
		int year;
		scan=new Scanner(System.in);
		System.out.println("Please neter a year");
		year=scan.nextInt();
		for(int i=0; i<10; i++) {
			if(year%400==0) {
				System.out.println("It is a leap year");
				break;
			}else if(year%4==0 && year%100!=0){
				System.out.println("It is a leap year");
			}else {
				System.out.println("It is not a leap year");
				break;
			}
		}
		
	}

}
