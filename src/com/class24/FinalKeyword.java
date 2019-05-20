package com.class24;

public final class FinalKeyword {
	
	public static final String name="Syntax";

	public static void main(String[] args) {
		// Final keyword can be used in 3 ways:
		// 1.Variables: the value of final variables cannot be changed --> Constant variables
		// 2.Methods: final methods cannot be overridden
		// 3.Classes: inheritance is not possible for final classes
		
		final String str="Hello";
		
	}
	public final void hello() {
		System.out.println("Hello from Parent class");
	}
}
