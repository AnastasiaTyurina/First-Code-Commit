package com.class31;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Homework {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Anastasia");
		names.add("Asel");
		names.add("Aigerim");
		names.add("John");
		
		Collections.sort(names);
		System.out.println(names);
		
		String[] surnames= {"Tyurina", "Zhekibayeva", "Boseman"};
		Arrays.sort(surnames);
		for(String n:surnames) {
			System.out.println(n);
		}
		
		HashSet <String> cities=new HashSet<>();
		cities.add("Kazan");
		cities.add("New York");
		cities.add("Arlington");
		
		System.out.println(cities);
		System.out.println(cities.size());
		
		cities.add("Kazan");
		System.out.println(cities.size());
		
		for(String cit:cities) {
			System.out.println(cit);
		}
		
		Iterator<String> iterator=cities.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ArrayList<String>city=new ArrayList<>(cities);
		Collections.sort(city);
		System.out.println(city);
		
		cities.removeAll(cities);
		System.out.println(cities);
		
		
		
		
	}

}
