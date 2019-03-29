package com.class7;

public class Loops {

	public static void main(String[] args) {
		// Loops in Java: 
		// while
		// do while
		// for
		// enhanced for loop (for each loop) / collections or arrays
		
		//while:
		
		boolean morning=true;
		if(morning) {
			System.out.println("Good morning"); //prints once
		}
		while(morning) {
			System.out.println("Good morning"); //prints infinitely
		}
		
		
		int a=1;
		
		while (a<10) {
			System.out.println("Hello");
			a++;
		}
	}

}
