package com.class24;

public class Parent {

	String str;
	Parent(){
		System.out.println("I am a parent constructor");
	}
}
class Child extends Parent{
	
	int num;
	Child(){
		System.out.println("I am a child constructor");
	}
}	// we cannot override constructors but we can overload them