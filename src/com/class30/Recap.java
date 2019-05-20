package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int[] array= {10, 10, 20, 20};
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(0, 13);
		numbers.add(0, 14);
		
		System.out.println(numbers.size()); // 3
		System.out.println(numbers.get(2)); // 12
		
		numbers.set(1,  33);
		System.out.println(numbers.get(1));
		
		System.out.println(numbers.contains(33));
		
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		for(int number:numbers) {
			System.out.println(number);
		}
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		int c=0;
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}
	
	}

}
