package com.class32;

import java.util.*;

public class AllKeysAndValuesFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println(map);
		System.out.println(map.size());
		
		//how to return a set of keys from the map
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(int key:keys) {
			System.out.print(key+" ");
		}
		System.out.println("");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			System.out.print(keysIt.next()+" ");
		}
		System.out.println("");
		
		//how to return all values from the map
		Collection<String> valCol=map.values();
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
