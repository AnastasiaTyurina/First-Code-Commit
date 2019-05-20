package com.class35;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		// 2 ways to create a String: String literal
		
		String str="Hello";
		
		String str2=new String("Bye");
		
		str=str.toUpperCase();
		str=str.replace("O", "a");
		
		System.out.println(str);
		
	}

}
