package com.class20;

public class Dog {

	static String breed="Husky";
	static int paws=4;
	
	String name;
	int weight, height;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
	    Dog dog2=new Dog();
	    Dog dog3=new Dog();
	    
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProperties();
		
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProperties();
		breed="Pug";
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		dog3.getDogProperties();
		
		dog1.getDogProperties();
		dog2.getDogProperties();
		
		// 3 ways of accessing static variables
		System.out.println(breed); //name
		System.out.println(Dog.breed); //class
		System.out.println(dog3.breed); //object
		
		
	}
	public void getDogProperties() {
		System.out.println(name+" is a breed of "+breed+" and its weight is "+weight+" and its height is "+height);
	}

}
