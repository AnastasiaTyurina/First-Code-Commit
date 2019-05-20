package com.class23;

public class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree{
	public  void getDegree() {
		System.out.println("I am a Postgraduate");
	}
}