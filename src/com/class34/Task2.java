package com.class34;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		returnList();
		List<Exception> exceptionList=returnList();
		System.out.println(exceptionList.size());
		
		for(Exception singleException:exceptionList) {
			System.out.println(singleException.getMessage());
		}
		
	}
	public static List<Exception> returnList() {
		
		List <Exception> list=new ArrayList<>();
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			list.add(e);
		}
		
		int[] array= {12, 13};
		try {
		System.out.println(array[2]);
		}catch(ArrayIndexOutOfBoundsException a) {
			list.add(a);
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		try{
			int age=scan.nextInt();
		}catch(InputMismatchException c) {
			list.add(c);
		}
		
		String str=null;
		try {
			System.out.println(str.length());
		}catch (NullPointerException b) {
			list.add(b);
		}
		
		
		return list;
	}
}
