package com.class18;

public class Application {

	public static void main(String[] args) {
		
		Human person1=new Human();
		person1.print();
		person1.eyeColor="Pink";
		
		person1.print();
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);

		Human person2=new Human();
		
		person2.eyeColor="Orange";
		
		System.out.println(person2.eyeColor);
		System.out.println(person2.height);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
		
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Minimum.minOfValues(array);
		System.out.println(Minimum.minOfValues(array));
		 
		int array1[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Minimum.maxOfValues(array1);
		System.out.println(Minimum.maxOfValues(array1));
		
		System.out.println(Calculator.sum(1, 34, 6));
		System.out.println(Calculator.average(5, 6, 9));
		System.out.println(Calculator.min(345, 567, 7));
		System.out.println(Calculator.max(5, 99, 245));
		
	}

}
