package com.class34;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println("The end of the program");

	}

}
