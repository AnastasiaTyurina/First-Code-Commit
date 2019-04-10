package com.class19;

public class Task1 {

	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.reverseString("Anastasia");
		System.out.println(obj.reverseString("Anastasia"));

	}
	String reverseString(String a) {
		String reverse="";
		char[] array=a.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		}
		return reverse;
	}

}
