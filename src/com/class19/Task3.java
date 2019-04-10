package com.class19;


public class Task3 {

	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.convert("I am a doctor");
		System.out.println(obj.convert("I am a doctor"));
	}
	private String[] convert(String a) {
		String[] array=a.split(" ");
		return array;
		}
		
	
	
}
