package com.JavaReview;

import java.util.HashMap;
import java.util.Map;

public class MarketingTest {

	public static void main(String[] args) {
		
		Map<String, Marketing> marketers=new HashMap<>();
		marketers.put("Joe", new Marketing("Joe", "shoes", 2000.00));
		marketers.put("Smith", new Marketing("Smith", "shoes", 4000.00));
		marketers.put("Adam", new Marketing("Adam", "shoes", 6000.00));
		marketers.put("Tiffany", new Marketing("Tiffany", "shoes", 7000.00));
		marketers.put("Aloha", new Marketing("Aloha", "shoes", 1000.00));
		marketers.put("Sam", new Marketing("Sam", "shoes", 10000.00));
		marketers.put("Mustafa", new Marketing("Mustafa", "shoes", 50000.00));
		marketers.put("Kelda", new Marketing("Kelda", "shoes", 3000.00));
		
		for(String key:marketers.keySet()) {
			Marketing m = marketers.get(key);
			if(m.getSaleAmount()>3000) {
				System.out.println(m.toString());
			}
		}
	}

}
