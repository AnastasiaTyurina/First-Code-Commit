package com.class27;

public abstract class Vehicle {
	
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
	}
	//public static abstract void gps(); we cannot have static/private/final abstract methods
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
}
abstract class Car extends Vehicle{
	
}
class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW car strats remotely");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
		
	}
	
}
class Toyota extends Car{

	@Override
	public void start() {
		System.out.println("Toyota car starts with a push button");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safely");
		
	}
	
}