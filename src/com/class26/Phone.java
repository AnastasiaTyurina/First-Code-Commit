package com.class26;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void sendText() {
		System.out.println("Phone can send texts");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
}
class iPhone extends Phone{ //concrete class: inherited from abstract class or implemented by interface and providing implementation of all unimplemented/abstract classes
	
	
	@Override
	public void viewPictures() {
	System.out.println("To view pictures on iPhone go to Images");	
	}
	@Override
	public void unlockPhone() {
	System.out.println("To unlock iPhone we can use FaceID or FingerPrint");	
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung phone we need a password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To vies pictures on Samsung phone we need to go to Gallery");
		
	}
	
}