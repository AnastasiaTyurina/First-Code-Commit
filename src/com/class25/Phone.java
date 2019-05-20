package com.class25;

public class Phone {

	public void makeCall() {
		System.out.println("We can make a phone call");
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}
}
class iPhone extends Phone{
	
	public void makeCall() {
		System.out.println("iPhone can make a facetime call");
	}
	public void hasCamera() {
		System.out.println("iPhone has a dual HD camera");
	}
}
class Nokia extends Phone{
	
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
}
class Samsung extends Phone{
	
	public void hasCamera() {
		System.out.println("Samsung has a 3-lense camera");
	}
}