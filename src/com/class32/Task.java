package com.class32;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		LinkedHashSet<String> list=new LinkedHashSet<>(aList);
		System.out.println(list);
		

	}

}
