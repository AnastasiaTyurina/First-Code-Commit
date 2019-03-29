package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		int a=1;
		
		while (a<10) {
			System.out.println("Hello");   //prints 10 times
			a++;
		}
		
		int b=0;
		while (b<5) {
			System.out.println("I am inside of while loop");  //prints 5 times
			b++;
		}
		System.out.println("I am outside of while loop");
		
		int z=10;
		while(z<=20) {
			System.out.println(z);
			z++;
		}
		int q=1;
		while (q<=20) {
			System.out.print(q+" ");
			q++;
		}
		
		int p=10;
		while(p>0) {
			System.out.println(p);
			p--;
		}
	}

}
