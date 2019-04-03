package com.class14;

public class StringManipulations1 {

	public static void main(String[] args) {
		// toCharArray() function converts a string into an array of characters
		
		String str="saturday";
		char[] array=str.toCharArray();
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]); //output:saturday
		}
		System.out.println();
		
		for(char array1 : array) {
			System.out.print(array1); //output:saturday
		}
		System.out.println();
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]); //output:yadrutas
		}
		System.out.println();
		
	}

}
