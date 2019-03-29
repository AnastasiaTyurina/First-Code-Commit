package com.Class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		String str="Students";
		char character=str.charAt(4);
		System.out.println(character); //output: e
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)); //output: Students
		}
		System.out.println();
		
		String str1="Sunday";
		int index=str1.indexOf("n");
		System.out.println(index); //output: 2
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax")); //output: 0
		System.out.println(str2.indexOf("Technologies")); //output: 7
		System.out.println(str2.indexOf(" ")); //output: 6
		System.out.println(str2.indexOf("w")); //output: -1
		
		String str3="Today is Sunday Java class";
		String newString=str3.substring(5);
		System.out.println(newString); //output: is Sunday Java class
		System.out.println(str3.substring(0, 5)); //output: Today
		System.out.println(str3.substring(9, 20)); //output: Sunday Java
		System.out.println(str3.substring(16, 20)); //output: Java
		System.out.println(str3.substring(21)); //output: class
		
		
		

	}

}
