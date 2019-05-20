package com.class31;

public abstract class Insurance {

	public String insuranceName;
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class Car extends Insurance{
	public String carModel;
	public Car(String insuranceName, String carModel) {
		this.insuranceName=insuranceName;
		this.carModel=carModel;
	}
	@Override
	public void getQuote() {
		System.out.println("Getting a quote from "+insuranceName+" for "+carModel);
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" cancelation policy for "+carModel);
	}
}
class Pet extends Insurance{
	public String petType;
	public Pet(String insuranceName, String petType) {
		this.insuranceName=insuranceName;
		this.petType=petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Getting a quote from "+insuranceName+" for "+petType);
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" cancellation policy for "+petType);
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	@Override
	public void getQuote() {
		System.out.println("Getting a quote from "+insuranceName);
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" cancellation policy");
	}
	
}