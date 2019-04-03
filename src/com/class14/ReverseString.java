package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string without using a reverse function
		
		String original="Today is Java Class";
		String reverse="";
		char[] array=original.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		}
		System.out.println(reverse); //output: ssalC avaJ si yadoT
		
		//CharAt()
		String reverse1="";
		for (int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);
		}
		System.out.println(reverse1); //output: output: ssalC avaJ si yadoT
		
		//substring
		String reverse3;
		for( int i=original.length()-1; i>=0; i--) {
			reverse3=original.substring(i,i+1);
			System.out.print(reverse3); //output: ssalC avaJ si yadoT
		}
		
	}

}
