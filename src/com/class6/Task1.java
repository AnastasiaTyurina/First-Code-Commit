package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;
		
		scan=new Scanner(System.in);
		System.out.println("What is the temperature in F?");
		temp=scan.nextInt();
		
		if(temp>=40 && temp<80) {
			System.out.println("Is it raining?");
			rain=scan.nextBoolean();
			if (rain) {
				activity="Watch a movie";
			} else {
				activity="Go on a hike";
			}
		} else if (temp>=20 && temp<40) {
			System.out.println("Is it snowing?");
			snow=scan.hasNextBoolean();
			if (snow) {
				activity="Snowboarding";
			} else {
				activity="Let's code at home";
			}
		} else if (temp>=80) {
			System.out.println("Is it sunny?");
			sunny=scan.nextBoolean();
			if (sunny) {
				activity="Go to the beach";
			} else {
				activity="Do more coding at home";
			}
		}else {
			System.out.println("Invalid entry");
			activity="Unknown";
		} 
		
		System.out.println("What to do today: "+activity);
		
	}

}
