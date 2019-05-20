package com.class27;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car=new BMW();
		car.drive();
		car.start();
		car.stop();
		System.out.println(Vehicle.vehicleCount);
		
		new BMW();
		new Toyota();
		System.out.println(Vehicle.vehicleCount);
	}

}
