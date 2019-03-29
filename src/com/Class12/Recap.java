package com.Class12;

public class Recap {

	public static void main(String[] args) {
		
		int[][] arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300}
		};
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		for(int[] singleArray:arr) {
			for(int numbers:singleArray) {
				System.out.println(numbers);
			}
		}
	}

}
