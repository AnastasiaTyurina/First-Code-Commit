package com.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		// array of names in the group, print one name, 2 ways of creating
			String[] group= {"Fabi", "Adrian", "Anastasia", "Aigerim"};
			System.out.println(group[2]);
			
			String[] group2=new String[4];
			group2[0]="Fabi";
			group2[1]="Adrian";
			group2[2]="Anastasia";
			group2[3]="Aigerim";
			System.out.println(group2[2]); 
			
		
		    
	}

}
