package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//take a boolean value from a user; make the variable isTrue;
		//if the input is true or false
		//First out put:"Input the boolean value"
		//Second Output:"The value is ___"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the boolean value");
		boolean isTrue=scan.nextBoolean();
		if (isTrue==true) {
			System.out.println("The value is true");
		} else {
			System.out.println("The value is false");
		}
		
				

	}

}
