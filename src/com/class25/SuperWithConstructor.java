package com.class25;

public class SuperWithConstructor {

	public SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	
	public ChildOfSuperWithConstructor() {
		super(); //added by compiler by default whether it is written in code or not. parent constructor automatically added
		System.out.println("I am a child constructor");
	}
}