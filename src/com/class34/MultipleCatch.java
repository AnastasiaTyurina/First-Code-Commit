package com.class34;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		try {
			Thread.sleep(2000);
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			// 3 ways to print the name and details of exception
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
			
			System.out.println("Code of Arithmetic Exception Catch");
		}catch (InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");	
		}
		System.out.println("End of the code");
	}

}
