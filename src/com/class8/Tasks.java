package com.class8;

public class Tasks {

	public static void main(String[] args) {
		// print even numbers between 20 and 50 (2 ways)
		//1 way
		for(int i=20; i<=50; i+=2) {
			System.out.println(i);
		}
		
		//2 way
		for (int g=20; g<=50; g++) {
			if(g%2==0) {
				System.out.println(g);
			}
		}
		//print odd numbers between 20 and 50 (2 ways)
		//1 way
		for(int a=20; a<=50; a++) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
		//2 way
		for(int a=21; a<=50; a+=2) {
			System.out.println(a);
		}

	}

}
