package com.class34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		try{
			age=scan.nextInt();
			System.out.println(age);
		}catch(InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("Wrong entry");
		}
		
		
	}

}
