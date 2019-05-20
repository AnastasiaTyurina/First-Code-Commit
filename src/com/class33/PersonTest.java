package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person("John", "Doe", 30, 80000);
		Person p2=new Person("James", "Smith", 34, 90000);
		Person p3=new Person("Anna", "Coleman", 29, 75000);
		
		p1.print();
		p2.print();
		p3.print();
		
		Map<Integer, Person> personMap=new HashMap<>();
		personMap.put(1, p1);
		personMap.put(2, p2);
		personMap.put(3, p3);
		
		Collection <Person> personValues=personMap.values();
		for(Person person:personValues) {
			person.print();
		}
	}

}
