package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// write a program to check work eligibility
		// if user is younger than 16, user is not allowed to work
		//otherwise, the user is  allowed to work
		//but if user is under 64, the user can go to work
		// otherwise, the user cannot work
		
		int age=65;
		int eligibleAge=16;
		int retirementAge=64;
		if (age<eligibleAge) {
			System.out.println("You are too young to work");
		} else {
			System.out.println("You are eligible to work");
			if(age<retirementAge) {
			System.out.println("Go to work");	
			} else {
				System.out.println("Please enjoy your life");
			}
					
		}
	
	}
}
