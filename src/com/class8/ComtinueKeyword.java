package com.class8;

public class ComtinueKeyword {

	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			if(i==2) {
				continue;
			}
				System.out.println(i); //skips 2: 0, 1, 3, 4, 5
				// use or || to skip more than one value
		}
		for(int a=01; a<=20; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.println(a); //skipping numbers divisible by 3
		}

	}

}
