package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasks {

	public static void main(String[] args) {
		// 1. array list of drinks. Remove every word that ends with letter "e"
		ArrayList<String>words=new ArrayList<String>();
		words.add("cringe");
		words.add("office");
		words.add("school");
		words.add("pen");
		System.out.println(words);
		
		Iterator<String> iterator=words.iterator();
		while(iterator.hasNext()) {
			String word=iterator.next();
			if(word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
		
		//2. array list of drinks. If any drink has letters "a" or "e" replace it with water
		
		ArrayList<String>drinks=new ArrayList<String>();
		drinks.add("juice");
		drinks.add("martini");
		drinks.add("milk");
		drinks.add("rum");
		System.out.println(drinks);
		
		for(int i=0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
		
		//3. array list of even numbers 1-50. Remove any number divisible by 5
		
		ArrayList <Integer>numbers=new ArrayList<Integer>();
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		for(int j=0; j<=numbers.size(); j++) {
			if(numbers.get(j)%5==0) {
				numbers.remove(j);
			}
		}
		System.out.println(numbers);

	}

}
