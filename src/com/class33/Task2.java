package com.class33;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
		
		Map <String, Integer> empl=new HashMap<>();
		empl.put("John", 70000);
		empl.put("James", 100000);
		empl.put("Anna", 80000);
		empl.put("Jess", 75000);
		
		int max=0;
		String key=null;
		for(Entry<String, Integer> em:empl.entrySet()) {
			if(em.getValue()>max) {
				max=em.getValue();
				key=em.getKey();
			}
		}
		System.out.println(key+" has the the highest salary of "+max);
	}

}
