package com.class14;

public class SplitString {

	public static void main(String[] args) {
		String str="Welcome Syntax Students Batch 4";
		String[] array=str.split("S");
		System.out.println(array.length); //output: 3
		for(String substrings:array) {
			System.out.print(substrings); //output: Welcome yntax tudents Batch 4
		}
		System.out.println();
		for( int i=0; i<array.length; i++) {
			System.out.print(array[i]); //output: Welcome yntax tudents Batch 4
		}
		System.out.println();
		
		
	}

}
