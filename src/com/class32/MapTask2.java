package com.class32;

import java.util.*;

public class MapTask2 {

	public static void main(String[] args) {
		
		Map<String, String> countries=new HashMap<>();
		countries.put("Russia", "Moscow");
		countries.put("USA", "Washington");
		countries.put("Ukraine", "Kiev");
		countries.put("France", "Paris");
		countries.put("England", "London");

		Set<String> keys=countries.keySet();
		System.out.println(keys);
		for(String key:keys) {
			System.out.print(key+" "+countries.get(key)+"; ");
		}
		System.out.println("");
		
		Iterator<String> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.print(key+" "+countries.get(key)+"; ");
		}
		System.out.println("");
		
		Collection<String> valCol=countries.values();
		for(String value:valCol) {
			System.out.print(value+" ");
		}
		System.out.println("");
		
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+" ");
		}
	}

}
