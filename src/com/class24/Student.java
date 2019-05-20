package com.class24;

public class Student {

	public void study() {
		System.out.println("Students must study");
	}
	
	protected void doHomework() {
		System.out.println("Students must do homework");
	}
	void attendClasses() {
		System.out.println("Students must attend classes");
	}
	//private methods cannot be overridden
	private void doResearch() {
		System.out.println("Students must do research");
	}
}
