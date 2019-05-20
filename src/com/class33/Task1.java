package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		
		String[] cities= {"London", "Paris", "Madrid", "Milan", "Washington"};
		
		Map<String, Integer> map=new HashMap<>();
		for(String city:cities) {
			map.put(city, city.length());
		}
		System.out.println(map);
		
		Iterator<Map.Entry<String, Integer>> setIt=map.entrySet().iterator();
		while(setIt.hasNext()) {
			Map.Entry<String, Integer> entry=setIt.next(); 
			if(entry.getValue()>7) {
			setIt.remove();
			}
		}
			System.out.println(map);
	}

}
