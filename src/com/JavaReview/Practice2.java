package com.JavaReview;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		
		String[] a= {"Sunday", "Monday", "Tuesday", "Wednesday"};
		for (int i=0; i<a.length; i++) {
			a[i] = a[i].substring(0,1)+a[i].substring(1,2).toUpperCase() + a[i].substring(2);
	
		System.out.println(a[i]);
		}
	}

}
