package com.class33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionRecap {

	public static void main(String[] args) {
		
		List <String> list=new ArrayList<>();
		list.add("Java");
		list.add("is");
		list.add("fun");
		
		System.out.println(list);
		list.get(2);
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(null, "E");
		map.put(5, null);
		map.put(4, "E");
		
		System.out.println(map);
		
		Map <String, Integer> map1=new Hashtable<>();
		map1.put("1", 2);
		map1.put(null, 3);
		System.out.println(map1);
		
		//hashtable is similar to hashmap but it does not allow null values
	}

}
