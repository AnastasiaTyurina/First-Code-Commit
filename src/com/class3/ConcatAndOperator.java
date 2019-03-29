package com.class3;

public class ConcatAndOperator {

	public static void main(String[] args) {
		String a="Hello";
		String b="Bye";
		
		int x=10;
		int y=20;
		
		System.out.println(x+y+a+b);
		System.out.println(x+a+y+b);
		System.out.println(x+a+b+y);
		System.out.println(a+b+x+y);
		System.out.println(a+b+(x+y));
		// calculation goes from left to right
		

	}

}
