package com.class34;

public class ThrowsKeyword {
	
	public static String name="John";

	public static void main(String[] args) {
	
		sleepMode();
		
	}
	public static void sleep() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Needs coffee");
	}
	public static void sleepAll() throws InterruptedException {
		sleep();
	}
	public static void sleepMode() {
		try {
			sleepAll();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
