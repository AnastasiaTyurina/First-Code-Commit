package com.class33;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
		
		String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		int key=1;
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		
		//printing keys and values using entry set (for loop and iterator)
		
		

	}

}
