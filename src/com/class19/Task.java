package com.class19;

public class Task {

	public static void main(String[] args) {
		Task obj=new Task();
		
		System.out.println(obj.createEmail("John","Snow","gmail"));

	}
	 String createEmail (String a, String b, String c) {
		String email=a+b+"@"+c+".com";
		return email;
	}
	 
}
