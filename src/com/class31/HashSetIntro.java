package com.class31;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		
		HashSet<Integer> hset=new HashSet<>();
		hset.add(12);
		hset.add(32);
		hset.add(34);
		
		//Set does not keep the order
		System.out.println(hset.size());
		System.out.println(hset);
		System.out.println(hset.contains(32));
		
		//Set Interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size());
		
		for(int num:hset) {
			System.out.println(num);
		}
		
		Iterator<Integer>iterator=hset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
