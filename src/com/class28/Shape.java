package com.class28;

public interface Shape {
	
	//1. Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimiter(). 
	//Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. Test your code.
	
	void calculateArea(int a);
	void calculatePerimiter(int a);
}
class Circle implements Shape{

	@Override
	public void calculateArea(int a) {
		double p=3.14;
		System.out.println("The area of the circle is "+(p*a*a));
		
	}

	@Override
	public void calculatePerimiter(int a) {
		double p=3.14;
		System.out.println("The perimeter of the circle is "+(2*p*a));
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea(int a) {
		System.out.println("The area of the square is "+(a*a));
		
	}

	@Override
	public void calculatePerimiter(int a) {
		System.out.println("The perimeter of the square is "+(4*a));
		
	}
	
}