package com.class21;

public class StaticConstructor {
	String name;
	public  StaticConstructor(String name) {
		System.out.println("My name is "+name);
		// constructor cannot be static
		// private constructors are only available within the same class
		
		//Constructor vs Method:
		//Differences:
		//1. Constructor has the same name as the class. Method can have any name
		//2. Constructor does not have a return type. Methods have 2 return types: void and return
		//3. Constructor cannot be static. Methods can be static or non static
		//4. Constructor gets called automatically. Methods have to be called
		//5. Constructor if not defined  is created by compiler. Compiler does not create methods
		//Similarities:
		//1. Both may or may not have parameters
		//2. Both can use access modifiers
		
	}
}
