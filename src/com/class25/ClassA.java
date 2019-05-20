package com.class25;

public class ClassA {

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.display();
		obj.display("String");

	}
	public final void display() {
		System.out.println("This is a final method");
	}
	public final void display(String str) {
		System.out.println("This is a final method with one integer parameter");
	}
}
