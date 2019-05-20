package com.class24;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}
class Puppy extends Animal{
	//cannot override static method with instance methods
	//public void whoAmI() {
		//System.out.println("I am a puppy");
	//}
}
class Monkey extends Animal{
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}