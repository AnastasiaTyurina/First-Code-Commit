package com.class28;

public class Car {
	//Create a Class Car that would have the following fields: 
	//carPrice and color and method calculateSalePrice() which should be returning a price of the car.
	//Create 2 sub classes: Sedan and Truck. 
	//The Truck class has field as weight and has its own implementation of  calculateSalePrice() method 
	//in which returned price calculated as following: if weight>2000 then returned car price should include 10%discount, otherwise 20%discount.
	//The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
	//if length of sedan is >20 feet then returned car price should include 5%discount, otherwise 10%discount 
	
	int carPrice;
	String color;
	void calculateSalePrice() {
		System.out.println(carPrice);
	}

}
class Sedan extends Car{
	int length;
	int discount;
	void calculateSalePrice(int carPrice, int length) {
		if(length>20) {
			discount=5;
		}else {
			discount=10;
		}
		int finalDiscount=(carPrice*discount)/100;
		System.out.println("The sales price of the car is "+(carPrice-finalDiscount));
	}
	
}
class Truck extends Car{
	int weight;
	int discount;
	
	void calculateSalePrice(int carPrice,  int weight) {
		if(weight>2000) {
			discount=10;
		}else {
			discount=20;
		}
		int finalDiscount=(carPrice*discount)/100;
		System.out.println("The sales price of the car is "+(carPrice-finalDiscount));
		
	}
}