package com.class16;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj=new Greetings();
		obj.hello();
		//finding largest number
		obj.findLargest(20, 10);
		obj.findLargest(30, 40);
		obj.helloToInstructor("Asel");
		obj.helloToInstructor("Arif");
	}
	void hello() {
		System.out.println("Hello");
	}
	void helloToInstructor(String name) {
		System.out.println("Hello "+name);
	}
	void findLargest(int a, int b) {
		
		if(a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b s larger than a");
		}
	}
}
