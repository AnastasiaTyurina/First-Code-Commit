package com.class22;

public class Area {
	
	public void area(int width, int length) {
		int area=width*length;
		System.out.println("The area of the rectangle is "+area);
	}
	public void area(int length) {
		int area=length*length;
		System.out.println("The area of the square is "+area);
	}
	public void area(int length, int width, int height) {
		int area=length*width*height;
		System.out.println("The volume of the box is "+area);
	}
}
