package com.class21;

public class StaticVersusNonStaticClass {

	public static void main(String[] args) {
		
		StaticVersusNonStatic obj=new StaticVersusNonStatic();
		//accessing non static members
		System.out.println(obj.name);
		obj.getInfo();
		//access static members by using className the belong to
		System.out.println(StaticVersusNonStatic.lastName);
		StaticVersusNonStatic.getInfo1();
	}

}
