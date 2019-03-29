package com.class11;

public class Tasks {

	public static void main(String[] args) {
		//1. arrays of cars with 6 elements. Print all values with 2 different loops
		String[] cars= {"Mercedez", "Audi", "Honda", "Chevrolet", "Hyundai", "BMW"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		for(String tachki: cars) {
			System.out.println(tachki);
		}

		//2. create an array of countries. Print capital of each country
		
		String[] countries= {"Russia", "USA", "Moldova", "Ukraine"};
		String[] capitals= {"Moscow", "Washington", "Kishinev", "Kiev"};
		for(int i=0; i<4; i++) {
			System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
		}
		for(String country:countries) {
			switch(country) {
			case "USA": System.out.println("Washington");
			break;
			case "Russia": System.out.println("Moscow");
			break;
			case "Moldova": System.out.println("Kishinev");
			break;
			case "Ukraine": System.out.println("Kiev");
			break;
			}
		}
		
		
		//3. Create an array on integers and calculate the sum of its elements
		int sum=0;
		int[] numbers= {234, 456, 12, 56, 87, 900, 64646};
		System.out.println(numbers[0]+numbers[1]+ numbers[2]+numbers[3]+numbers[4]+numbers[5]+numbers[6]);
		for(int i:numbers) {
			sum+=i;
			}
			System.out.println(sum);
			
		//array of integers and find the largest
		int[] integers= {234, 456, 789, 1, 67, 3, 10000};
		int max=integers[0];
		for(int i=0; i<7; i++) {
			if (integers[i]>max) {
				max=integers[i];
			}				
		}
		System.out.println("The largest number is "+max);
	
		
		
			
		
	}

}
