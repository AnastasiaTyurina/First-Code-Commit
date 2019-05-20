package com.class32;

import java.util.*;
import java.util.Map.Entry;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		
		Map<String, String> user=new LinkedHashMap<>();
		user.put("Name", "Alex Smith");
		user.put("Salary", "90000");
		user.put("Department", "IT");
		user.put("Title", "Automation Tester");
		
		System.out.println(user);
		user.entrySet();
		for(Map.Entry entry:user.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			}
		
		for(Map.Entry entry:user.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		Iterator<Map.Entry<String, String>> it=user.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
