package com.class10;

public class Arrays {

	public static void main(String[] args) {
		int num;
		num=10;
		int[] array1;
		int [] array2;
		int array3[];
		
		array1=new int[4];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		System.out.println(array1[2]); //30
		
		int[] numbers=new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=66;
		System.out.println(numbers[2]); //66
		System.out.println(numbers[1]/numbers[0]); //2
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		System.out.println(a[1]+ " friends"); //Hi friends
		
		
		

	}

}
