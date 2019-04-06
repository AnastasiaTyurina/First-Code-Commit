package com.class17;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		NestedLoop2 loop=new NestedLoop2();
		
		loop.a();

	}
	void a() {
		for(int i=0; i<3; i++) {
			
			for (int y=0; y<3; y++) {
				System.out.println("I am an inner loop");
			}
			System.out.println("------I am an outer loop-----");
		}
		

	}

}
