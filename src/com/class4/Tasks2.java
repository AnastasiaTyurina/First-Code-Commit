package com.class4;

import java.util.Scanner;

public class Tasks2 {

	public static void main(String[] args) {
		// Task1
		//variables store mortgage rate and mortgage price.
		//if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying
		//if price is larger than 200,000 user will take a loan, otherwise pay cash
		
		int mortgageRate=3;
		int mortgagePrice=200000;
		
		
		if(mortgageRate>4.5) {
			System.out.println("User will not buy the house");
		} else {
			System.out.println("User will consider buying a house");
			if(mortgagePrice>200000) {
				System.out.println("User will take out a loan");
			} else {
				System.out.println("User will pay cash");
			}
		}	
			//Task2
			//Write a program to ask user to enter numbers of worked years and annual salary. 
			//If user worked for more or equals to 5 years than user is eligible for the bonus, 
			//otherwise he is not. 
			//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		int workedYears, annualSalary;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter the number of years you worked");
		workedYears=myScanner.nextInt();
		System.out.println("Enetr your annual salary");
		annualSalary=myScanner.nextInt();
		
		if(workedYears<5) {
			System.out.println("User is not eligible for the bonus");
		} else {
			System.out.println("User is eligible for the bonus");
			if(annualSalary>50000) {
				System.out.println("The bonus is 5000");
			} else {
				System.out.println("The bonus is 3000");
			}
		}
	}

}
