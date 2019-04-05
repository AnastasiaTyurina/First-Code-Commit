package com.class16;

public class ReturnValue {

	public static void main(String[] args) {
		
		String str="Hello";
		int stringLength=str.length();
		System.out.println(stringLength);
		
		ReturnValue obj=new ReturnValue();
		obj.askHowAreYou("Asel");
		
		String day=obj.date();
		System.out.println("Today is "+day);

	}
	void askHowAreYou(String name) {
		System.out.println("How are you "+name+"?");
	}
	String date() {
		return "Thursday";
	}

}
