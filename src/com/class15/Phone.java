package com.class15;

public class Phone {
		boolean charger, camera;
		String color, model;
		int size, screen;  

	public static void main(String[] args) {
		// iPhone, Android, Nokia

		Phone Android=new Phone();
		Android.charger=true;
		Android.camera=true;
		Android.color="rose gold";
		Android.model="S10";
		Android.size=215;
		Android.screen=200;
		
		Android.call();
		Android.internet();
		Android.takePictures();
		
		
		Phone iPhone=new Phone();
		iPhone.charger=true;
		iPhone.camera=false;
		iPhone.color="black";
		iPhone.model="X 2.0";
		iPhone.size=100;
		iPhone.screen=75;
		
		iPhone.call();
		iPhone.internet();
		iPhone.takePictures();
		
		Phone Nokia=new Phone();
		Nokia.charger=false;
		Nokia.camera=false;
		Nokia.color="white";
		Nokia.model="0001";
		Nokia.size=25;
		Nokia.screen=15;
		
		Nokia.call();
		Nokia.internet();
		Nokia.takePictures();
		
	}
	private void call() {
		// TODO Auto-generated method stub
		System.out.println("You can make a phone call on ");
	}
	private void internet() {
		// TODO Auto-generated method stub
		System.out.println("You can browse web");
	}
	private void takePictures() {
		// TODO Auto-generated method stub
		System.out.println("You can take pictures");
	}
	

}
