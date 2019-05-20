package com.class32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		
		Set <String> classDay=new TreeSet<>();
		classDay.add("Tuesday");
		classDay.add("Wednesday");
		classDay.add("Thursday");
		classDay.add("Saturday");
		classDay.add("Sunday");
		
		System.out.println(classDay);
		
		for(String day:classDay) {
			System.out.println(day);
		}
		
		Iterator<String> it=classDay.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//LinkedHashSet keeps the order of input
		//TreeSet keeps the element in order based on their values (0-9)(A-Z)
		//None allows duplicates
		
		
	}

}
