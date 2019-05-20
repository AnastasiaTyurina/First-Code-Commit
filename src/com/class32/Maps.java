package com.class32;

import java.util.HashMap;
import java.util.Map;

//import java.util.*;    allows to import whatever you may need later in the program

public class Maps {

	public static void main(String[] args) {
		//Map <Key, Value>     values can be duplicated but the keys are always different
		Map<Integer, String> map=new HashMap<>();
		//adding entries
		map.put(101,  "John");
		map.put(102,  "Jane");
		map.put(103,  "Kate");
		map.put(104,  "James");
		//retrieve or access values
		System.out.println(map.get(102));
		//how to find a size of a map
		System.out.println(map.size());
		//how to update entry
		map.replace(103, "Bilal");
		System.out.println(map.get(103));
		//how to remove
		map.remove(104);
		System.out.println(map.size());
		//how to check if there are any values in the map
		System.out.println(map.isEmpty());
		//to check if there is a specific key or value
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Bilal"));
		
		map.put(105, "Jane");
		System.out.println(map);
		map.put(101, "Shaban"); //automatically replaces it
		System.out.println(map);
		map.put(null, "Some value");
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		
		
	}

}
