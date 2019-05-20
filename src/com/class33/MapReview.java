package com.class33;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {

	public static void main(String[] args) {
		
		Map <String, Integer> grocery=new LinkedHashMap<>();
		grocery.put("Milk", 1);
		grocery.put("Bread", 2);
		grocery.put("Eggs", 12);
		grocery.put("Coffee", 2);
		grocery.put("Potatoes", 2);
		grocery.put("Cookies", 3);

		System.out.println(grocery);
		grocery.put("Cheese", 1);
		System.out.println(grocery.size());
		
		grocery.replace("Eggs", 18);
		System.out.println(grocery);
		
		grocery.remove("Cheese");
		System.out.println(grocery);
		
		
		//retrieving all keys and values using key set
		
		Set<String>keySet=grocery.keySet();
		for(String key:keySet) {
			System.out.println("The key is "+key+" and the value is "+grocery.get(key));
		}
		
		///using Iterator
		
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			String k=it.next();
			System.out.println(k+" "+":"+" "+grocery.get(k));
		}
		
		//same thing in a different way
		
		for(String key:grocery.keySet()) {
			System.out.println("The key is "+key+" and the value is "+grocery.get(key));
		}
		
		Iterator<String> keyIt=grocery.keySet().iterator();
		while(keyIt.hasNext()) {
			String k=keyIt.next();
			System.out.println(k+" "+":"+" "+grocery.get(k));
		}
		
		//retrieving all values using collection
		
		Collection<Integer> valCol=grocery.values();
		for(int value:valCol) {
			System.out.println(value);
		}
		//another way to do this
		for(int value:grocery.values()) {
			System.out.println(value);
		}
		//using collection and iterator
		Iterator<Integer> valueIt=grocery.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		//retrieving all keys and values using entry set
		
		for(Map.Entry<String, Integer> entry:grocery.entrySet()) {
			String abc=entry.getKey()+" "+entry.getValue();
			System.out.println(abc);
		}
		//using entry set and iterator
		Iterator<Map.Entry<String, Integer>> setIt=grocery.entrySet().iterator();
		while(setIt.hasNext()) {
			Map.Entry<String, Integer> entry=setIt.next(); //returns one single entry
			// another way to do it is: Entry entry=setIt.next();
			//System.out.println(entry); 
			//or
			String str=entry.getKey()+" "+entry.getValue();
			System.out.println(str);
		}
		
		
		
	}

}
