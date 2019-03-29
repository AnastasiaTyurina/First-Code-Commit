package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		*/
		
		for(int i=1; i<=5; i++) {
			for(int y=1; y<6; y++) {
			System.out.print(y); //12345
			}
			System.out.println();
		}

	}

}
