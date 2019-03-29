package com.class6;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your county of origin");
		country=scan.nextLine();
		
		switch(country) {
		
		case "USA":
			food="burger";
			break;
		case "Afghanistan":
			food="palau";
			break;
		case "Russia":
			food="pelmeni";
			break;
		case "Italy":
			food="pasta";
			break;
		case "Turkey":
			food="baklava";
			break;
		case "Morocco":
			food="Cous cous";
			break;
		case "Kazakhstan":
			food="beshparmak";
			break;
		case "Pakistan":
			food="biryani";
			break;
		default:
			food="unlknown";
			
		
			}
		System.out.println("Yor favorite food is "+food);
			
		

	}

}
