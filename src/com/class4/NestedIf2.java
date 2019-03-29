package com.class4;

public class NestedIf2 {

	public static void main(String[] args) {
		// declare variable for gpa and having a diploma
		//if user has a diploma, print "Congratulations"
		//if gpa is higher 3.5, print "hire a person"
		//otherwise, print "Do not hire"
		
		double gpa=3.6;
		double expectedGpa=3.7;
		
		boolean hasDiploma=true;
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {
				System.out.println("Hire a person");
			} else {
				System.out.println("We cannot hire you");
			}
		} else {
			System.out.println("Please go get a degree");
		}

	}

}
