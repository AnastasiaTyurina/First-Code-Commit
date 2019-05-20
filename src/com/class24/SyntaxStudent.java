package com.class24;

public class SyntaxStudent extends Student{
	
	public void study() {
		System.out.println("Syntax students must study hard");
	}
	
    public  void doHomework() {
		System.out.println("Syntax students must do Repl");
	}
	public void attendClasses() {
		System.out.println("Syntax students must attend all classes");
	}
	//creating child-specific private method
	//private methods do not participate in inheritance
	private void doResearch() {
		System.out.println("Syntax students must do a lot of research");
	}
}