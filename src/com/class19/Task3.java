package com.class19;


public class Task3 {

	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.convert("I am a doctor");
		
	}
	private void convert(String a) {
		String[] array=a.split(" ");
		for(String b:array) {
			System.out.println(b);
			
		}
		
	}
	
}
