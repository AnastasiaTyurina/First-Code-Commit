package com.class25;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("-----Object of the parent class-----");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("-----Object of the iPhone class-----");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("-----Object of the Samsung class-----");
		Samsung samsung=new Samsung();
		samsung.hasCamera();
		samsung.makeCall();
		
		System.out.println("-----Object of the Nokia class-----");
		Nokia nokia=new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		
		System.out.println("-----Object of the iPhone class referring to the parent-----");
		Phone p=new iPhone();
		p.hasCamera();
		p.makeCall();
		
		System.out.println("-----Object of the Nokia class referring to the parent-----");
		Phone p1=new Nokia();
		p1.hasCamera();
		p1.makeCall();
		
		Phone parentPhone;
		parentPhone=new iPhone();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		parentPhone=new Samsung();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		parentPhone=new Nokia();
		parentPhone.hasCamera();
		parentPhone.makeCall();
	}

}
