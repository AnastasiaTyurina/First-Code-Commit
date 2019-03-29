package com.class4;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		//Task 1
		// ask user what is the amount of loan
		//if loan is less than 200,000 you would lend the money, otherwise you would reject the client
		int loan;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter the amount of your loan");
		loan=myScanner.nextInt();
		if(loan<200000) {
			System.out.println("Your loan is approved");
		} else {
			System.out.println("Your loan is declined");
		}
		
		//Task2
		//ask user their age
		//if they are 18 and older you would issue driving licence, otherwise you will issue learning permit
		
		int age;
		Scanner myScanner2=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=myScanner2.nextInt();
		
		if(age<18) {
			System.out.println("You will be issued a learning permit");
		} else {
			System.out.println("You will be issued a driving licence");
		}
		
	}

}
