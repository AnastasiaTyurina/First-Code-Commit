package com.class32;

import java.util.HashMap;
import java.util.Map;

public class MapTask {

	public static void main(String[] args) {
		
		Map <Integer, String> building=new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Syntax");
		building.put(5, "Google");
		building.put(6, "Syntax");
		building.put(7, "Google");
		
		System.out.println(building);
		System.out.println(building.size());
		building.replace(4, "Apple");
		System.out.println(building);
		building.remove(7);
		System.out.println(building);

	}

}
