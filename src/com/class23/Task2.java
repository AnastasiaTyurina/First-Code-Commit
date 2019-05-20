package com.class23;

public class Task2 {
	
	//Create 1 class with a static method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.

	public static void print() {
		System.out.println("No parameters");
	}
	public static void print (String str) {
		System.out.println("One String paparmeter: "+str);
	}
	public static void print (int a, int b, int c) {
		System.out.println("Three integer parameters: "+a+" "+b+" "+c);
	}
}
