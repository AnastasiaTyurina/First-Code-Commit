package com.class25;

public class SuperKeyword {

	String name="John";
	
	public void sayName() {
		System.out.println("Parent's name is "+name);
	}
}
class ChildOfSuperKeyword extends SuperKeyword{
	
	String name="Michael";
	
	public void sayName() {
		System.out.println("Parent's name is "+super.name);
		System.out.println("Child's name is "+name);
	}
	public void callingMethods() {
		sayName();
		super.sayName();
	}
}