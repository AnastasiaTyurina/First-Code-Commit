package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// we have 7 days a week
		// if days are from 1 to 5, it is a weekday
		// if days are from 6 to 7, it is weekend
		// otherwise, it is not a valid date
		
		int day=8;
		if (day==1 || day==2 || day==3 || day==4| day==5) {
			System.out.println("It is a weekday");
		} else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("It is not a valid date");
		}

	}

}
