package com.class16;

public class Tasks {

	public static void main(String[] args) {
	Tasks num=new Tasks();
	num.even(25);
	Tasks str=new Tasks();
	str.palindrome("level");
	
	}
	void even(int num) {
		if(num%2==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
	
	
	void palindrome(String str) {
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(str.contentEquals(reverse)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}
}
