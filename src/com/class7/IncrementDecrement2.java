package com.class7;

public class IncrementDecrement2 {

	public static void main(String[] args) {
		// post increment & post decrement
		//a++ & a--
		
		int a=299;
		a++;
		System.out.println(a); //300
		
		int b=a++;
		System.out.println(b); //300
		
		int c=299;
		int d=c++;
		System.out.println(c); //300
		System.out.println(d); //299
		
		int z=10;
		int y=z--;
		System.out.println(z); //9
		System.out.println(y); //10
		
		

	}

}
