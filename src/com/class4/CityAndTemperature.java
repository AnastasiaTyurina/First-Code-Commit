package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// ask user to enter city and temperature in Fahrenheit
		//Your program should convert Fahrenheit into Celcius
		//Your program should say "The temperature in the city ... is ..."
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myScanner.nextLine();
		System.out.println("Please enter temperature in Fahrenheit");
		temp=myScanner.nextInt();
		//formula (F-32)*5/9
		int convertedTemp=(temp-32)*5/9;
	
		System.out.println("The temperature in "+cityName+" is "+convertedTemp+"C");
		
	}

}
