package com.class18;

public class Calculator {
	
	static int sum(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
	}
	static int average(int a, int b, int c) {
		int average=(a+b+c)/3;
		return average;
	}
	static int min(int a, int b, int c) {
		int min;
		if(a<b && a<c) {
			min=a;
		}else if (b<a && b<c) {
			min=b;
		} else {
			min=c;
		}
		return min;
	}
	static int max(int a, int b, int c) {
		
		int max;
		if(a>b && a>c) {
			max=a;
		}else if (b>a && b>c) {
			max=b;
		} else {
			max=c;
		}
		return max;	
	}

}
