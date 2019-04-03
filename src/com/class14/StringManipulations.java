package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		//.replace function can replace letters, numbers, characters
		String str="I am a good tester";
		String newStr=str.replace("a",  "e");
		System.out.println(newStr);	//output: I em e geed tester
		
		String newStr1=str.replace("good",  "great");
		System.out.println(newStr1); //output: I am a great tester
		
		String newStr2=str.replace("tester",  "programmer");
		System.out.println(newStr2); //output: I am a good programmer
		
		//.replaceAll function can replace all of the letters or numbers or all of the characters in a string
		String str1="12Hello 3234 World 465%^%";
		String replaced=str1.replaceAll("[0-9]", "");
		System.out.println(replaced); //output: Hello World %^%
		
		String replacedNoCharacter=replaced.replaceAll("[A-Za-z]", "");
		System.out.println(replacedNoCharacter); //output:  %^%
		
		String onlyLetters=replaced.replaceAll("[^A-Za-z]", " ");
		System.out.println(onlyLetters); //output: Hello World
		
		//[^abc]-any character except a, b, or c
		//[0-9]-numbers
		//[A-Z]-upper case letters
		//[a-z]-lower case numbers
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", "")); //output: 1123
		
	}

}
