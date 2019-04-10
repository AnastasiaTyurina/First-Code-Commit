package com.class19;

public class Task2 {

	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.palindrome("levels");
		System.out.println(obj.palindrome("levels"));	

	}
	public String palindrome(String a) {
		String reverse="";
		String b;
		for (int i=a.length()-1; i>=0; i--) {
			reverse=reverse+a.charAt(i);
		}
		if(a.equals(reverse)) {
			 b="This is a palindrome";
		}else {
			 b="This is not a palindrome";
		}
		return b;
	}

}
