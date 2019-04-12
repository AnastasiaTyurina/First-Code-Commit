package com.class20;

public class Car {
	
	public String color;
	public  static int totalCars;
	

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		Car.totalCars++;
		
		Car car2=new Car();
		car2.color="black";
		totalCars++;
		
		System.out.println(totalCars); // 2
	}

}
