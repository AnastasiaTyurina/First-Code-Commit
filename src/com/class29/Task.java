package com.class29;

import java.util.ArrayList;
import java.util.Iterator;


public class Task {

	public static void main(String[] args) {
		
		//Create a generic ArrayList that will store 5 names into it.
		//Find out whether the given ArrayList is empty or not?
		//Check whether the specific name is present in an ArrayList or not?
		//Find the size of your arrayList and print all values from that
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Anastasia");
		names.add("Aigerim");
		names.add("Denis");
		names.add("Ali");
		names.add("Alexander");
		
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).equals("Ali")) {
			System.out.println("Array list contains name Ali");
			}
		}
		if(names.isEmpty()) {
			System.out.println("Array list is empty");
		} else {
			System.out.println("Array list is not empty");
		}
		System.out.println("The size of the array is "+names.size());
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		Iterator <String> it=names.iterator();
		//boolean check=it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList alist=new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(100.10);
		alist.add(true);
		alist.add('a');
		
		for(Object values:alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		System.out.println(booleanArrayList);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}

		
		
	}

}
