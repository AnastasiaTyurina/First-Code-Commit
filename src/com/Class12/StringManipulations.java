package com.Class12;

public class StringManipulations {

	public static void main(String[] args) {
		String str="Syntax";
		int lengthOfString=str.length();
		System.out.println(lengthOfString); //output: 6
		
		String str1="Syntax Technologies"; 
		int lengthOfSecondString=str1.length();
		System.out.println(lengthOfSecondString); //output: 19
		
		String str2="Welcome, students!";
		System.out.println(str2.length()); //output: 18
		
		String str3="Hello";
		String newString=str3.toUpperCase();
		System.out.println(newString); //output: HELLO
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString); //output: hello
		
		String str4="Hello";
		String str5="hello";
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality); //output: false
		
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals); //output: true
		
		
		
	}

}
