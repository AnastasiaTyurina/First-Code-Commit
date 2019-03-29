package com.class3;

public class part3 {

	public static void main(String[] args) {
	int a=19;
	int b=50;
	boolean result=a>b;
	System.out.println(result);
	
	boolean result1=a==b;
	System.out.println(result1);
	
	//compare2 numbers. if a is > than b, then print...
	
	if (a>b) {
		System.out.println("a is larger than b");
	} else {
		System.out.println("b is larger than a");
	}
	
	//declare price. if price is higher than expected price, print "I will not buy"
	
	double shoePrice=232.99;
	double allowedPrice=31.99;
	if (allowedPrice>shoePrice) {
		System.out.println("I will buy the shoes");
	} else {
		System.out.println("I will not buy the shoes");
	}
	
	}

}
