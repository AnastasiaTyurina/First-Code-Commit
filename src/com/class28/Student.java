package com.class28;

public class Student {

	private String name;
	private int age;
	
	public void setName(String name) {
		if(!name.isEmpty()) {
		this.name=name;
		}
	}
	public void setAge(int age) {
		if(age>=18) {
		this.age=age;
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
