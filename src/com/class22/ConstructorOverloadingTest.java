package com.class22;

public class ConstructorOverloadingTest {

	public static void main(String[] args) {
		
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(156);
		ConstructorOverloading obj3=new ConstructorOverloading("String 1");
		ConstructorOverloading obj4=new ConstructorOverloading("String 1", "String 2");
	}

}
