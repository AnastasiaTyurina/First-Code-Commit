package com.class21;

public class StaticVersusNonStatic {
	public String name="John"; //instance variable
	public static String lastName="Snow"; //static variable
	public static void main(String[] args) {
		StaticVersusNonStatic obj=new StaticVersusNonStatic();
		obj.getInfo();
		getInfo1();
		System.out.println(lastName);
		//System.out.println(name); instance variables can only be accessed through an object
		System.out.println(obj.name);
	}
	//non static method
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		getInfo1();// we can call static methods within non static methods
	}
	//static method
	//static methods can only have access to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName);
		//will get an error
		System.out.println("I am a static method");
		//getInfo(); we cannot call non static methods within static methods
	}
	
}
