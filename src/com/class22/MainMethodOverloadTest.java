package com.class22;

public class MainMethodOverloadTest {

	public static void main(String[] args) {
		MainMethodOverload.main();
		MainMethodOverload.main("String 1");
		MainMethodOverload.main(567);
		String[] array= {"Hello", "Bye"};
		MainMethodOverload.main(array);
	}

}
