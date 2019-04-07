package com.class18;

public class Human {
	static String eyeColor="Brown";
	int height=6;
	int weight=180;
	String gender="F";
	
	String programmingLanguage="Java";
	
	
	void speak() {
		String language="English";
		System.out.println("Humans can speak "+language);
	}
	
	void coding() {
		System.out.println("Syntax students can code");
	}
	void print() {
		System.out.println(eyeColor);
	}
	public static void main(String[] args) {
		Human person=new Human();
		person.print();
	}
}
