package com.class22;

public class MainMethodOverload {

	public static void main(String[] args) {
		System.out.println("I am main method with String array argument");
	}
	
	public static void main() {
		System.out.println("I am main method with no parameters");
	}
	
	public static void main(String args) {
		System.out.println("I am main method with with 1 String parameter");
	}
	
	public static void main(int a) {
		System.out.println("I am main method with 1 integer parameter");
	}

}
