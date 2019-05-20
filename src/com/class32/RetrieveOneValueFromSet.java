package com.class32;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValueFromSet {

	public static void main(String[] args) {
		
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		
		//converting to ArrayList
		
		List<String> list=new ArrayList<>(cars);
		System.out.println(list);
		System.out.println(list.get(2));
		
		List<String> list2=new ArrayList<>();
		list2.addAll(cars);
		list2.add("Ford");
		System.out.println(list2);
		
		Object[] array=cars.toArray();
		System.out.println(array[1]);
		

	}

}
