package com.class23;

public class Task3 {

	//Create 1 class with a private method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	private static void print() {
		System.out.println("No parameters");
	}
	private static void print (String str) {
		System.out.println("One String paparmeter: "+str);
	}
	private static void print (int a, int b, int c) {
		System.out.println("Three integer parameters: "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Task3.print();
		Task3.print("Java");
		Task3.print(1, 2, 3);
		
	}
}
