package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		// Logical And &&
		// TRUE AND TRUE = TRUE;
		// TRUE AND FALSE = FALSE;
		// FALSE AND TRUE = FALSE;
		// FALSE AND FALSE = FALSE;
		
		
		// Logical or ||
		// TRUE OR TRUE = TRUE;
		// TRUE OR FALSE = TRUE;
		// FALSE OR TRUE = TRUE;
		// FALSE OR FALSE = FALSE;
		
		// if number is between 1 and 10, the number is small
		// if number is between 11 and 100, the number is medium
		// if number is between 101 and 1000, the number is large
		
		int num=3000;
		if(num>=1 && num<=10) {
			System.out.println("The number is small");
		}else if (num>=11 && num<=100) {
				System.out.println("The number is medium");
			}else if (num>=101 && num<=1000) {
					System.out.println("The number is large");
				} else {
					System.out.println("The number is out of range");
				}
	
	}

}
