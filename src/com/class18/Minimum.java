package com.class18;

public class Minimum {
	
	static  int minOfValues(int[] array) {
		int min=array[0];
	        for (int arr:array) {
	        	if(arr<min) {
	        		min=arr;
	        	}
		}
	    return min;
	}
	static int maxOfValues(int[] array) {
		int max=array[0];
		for(int arr:array) {
			if(arr>max) {
				max=arr;
			}
		}
		return max;
	}
}
