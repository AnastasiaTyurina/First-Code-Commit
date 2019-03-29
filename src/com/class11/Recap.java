package com.class11;

public class Recap {

	public static void main(String[] args) {
		// create an array of names with 5 elements and retrieve all values from it
		String[] names=new String[5];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

		// create an array using literal
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		//advanced for loop, for each loop, enhanced loop
		
		for(String student:studentNames) {
			System.out.println(student);
		}
	}

}
