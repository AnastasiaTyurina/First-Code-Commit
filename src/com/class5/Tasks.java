package com.class5;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		// 2 people's heights
		// under 5 = short, 5-6 = medium, 6 and over = tall
		float height1;
		float height2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first person's height");
		height1=scan.nextFloat();
		System.out.println("Please enetr second person's height");
		height2=scan.nextFloat();
		
		if(height1<5) {
			System.out.println("The first person is short");
		} else if(height1>=5 && height1<6) {
			System.out.println("The first person is medium");
		} else {
			System.out.println("The first person is tall");
		}
		
		if(height2<5) {
			System.out.println("The second person is short");
		} else if(height2>=5 && height2<6) {
			System.out.println("The second person is medium");
		} else {
			System.out.println("The second person is tall");
		}

	}

}
