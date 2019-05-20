package com.class21;

public class Task {
	
	private Task(String name) {
		System.out.println("My name is "+name);
	}
	public static void main(String[] args) {
		Task.callName("Mary");
	
	}
	public static void callName(String name) {
		System.out.println("My name is "+name);
	}
}
