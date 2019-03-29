package com.Class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains); //output: true
		
		String present="Welcome, Asel";
		boolean value=present.contains("Welcome,");
		System.out.println(value); //output: true
		
		String neededValue="Welcome,";
		boolean value1=present.toLowerCase().contains(neededValue);
		System.out.println(value1); //output: false
		
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts); //output: true
		
		System.out.println(str1.endsWith("x")); //output: true
		
		String str2="Hello";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty); //output: false
		
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4); //output: Hello Ali!
		
		System.out.println(str3.concat(str4)); //same output
		
		String expected="You may qualify for a multi-policy discount!";
		String actual=" You may qualify for a multi-policy discount! ";
		System.out.println(expected.contentEquals(actual)); //output: false
		
		actual=actual.trim();
		System.out.println(expected.equals(actual)); //output: true
		
		
				

	}

}
