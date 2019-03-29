package com.class13;

public class Practice {

	public static void main(String[] args) {
		for(int c=0; c<11; c++) {
		for(int i=0; i<11; i++) {
			System.out.print("- ");
		}System.out.println();
	}
		int[] array= {1, 234, 456, 76,5,47};
		int sum=0;
		for( int d=0; d<array.length; d++) {
			sum=sum+array[d];
		}
		double average=sum/array.length;
		System.out.println(average);
		
	String str="Sunday";
	for(int n=5; n>=0; n--) {
		System.out.print(str.charAt(n)); 
	}System.out.println();
	
	String str2="I want to go home";
	int middle;
	if(str2.length()>0) {
		if(str2.length()%2!=0 && str2.length()>=3) {
			middle=str2.length()/2;
			System.out.println(str2.charAt(middle));
		}
	}
	}
}
