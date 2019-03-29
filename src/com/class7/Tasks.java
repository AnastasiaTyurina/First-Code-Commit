package com.class7;

public class Tasks {

	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
			
			if (day==6) {
				System.out.println("I do not need a day off");
				workDay=false;
			} else {
				System.out.println("I need a day off");
			}
			day++;
		}

	}

}
