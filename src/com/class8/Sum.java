package com.class8;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum); //15
		
		// sum of all even numbers from 1 to 100
		int sum2=0;
		for(int b=2; b<=100; b+=2) {
			sum2=sum2+b;
		}
		System.out.println(sum2);
	}

}
