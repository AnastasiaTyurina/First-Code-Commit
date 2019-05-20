package com.class21;

public class Car {

	public static String make="Toyota";
	String color;
	String model;
	int doors;
	boolean engine;
	
	Car(){
		System.out.println("I am a constructor");
		System.out.println("Hello from construcdtor");
	}
	
	public static void main(String[] args) {
		
		Car obj=new Car(); 
		//constructor gives default value to all variables that haven't been initialized
		System.out.println(obj.color); //String: null
		System.out.println(obj.doors); //integer: 0
		System.out.println(obj.engine); //boolean: false
		hello();
	}
	public static void hello() {
		//before using local variables, we have to initialize them
		String name;
		//System.out.println(name); - compiler error
		System.out.println("I am a static hello method");
	}

}
