package com.class32;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer> classMap=new LinkedHashMap<>();
		classMap.put("Table", 20);
		classMap.put("Chairs", 60);
		classMap.put("Screens", 3);
		classMap.put("Students", 60);
		classMap.put("Instructor", 3);

		System.out.println(classMap);
		for(Map.Entry entry:classMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		Iterator<Map.Entry<String, Integer>> it=classMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> me=it.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
