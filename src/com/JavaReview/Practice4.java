package com.JavaReview;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
// Write a Java program to get the difference between the largest and smallest values in an array of integers.
//The length of the array must be 1 and above
		        
		        
		int[] array = new int[5]; 
		double max= 0;
		double min= array[0];
		double dif;
		    
		Scanner scan = new Scanner(System.in);
		        
		System.out.println("Enter 5 integers");
		for(int i=0; i<5; i++) {
			array[i]=scan.nextInt(); 
			min=array[i];
		}
		for (int arr:array) {
        	if(arr>max) {
        		max=arr;
        	}
        	if(arr<min) {
        		min=arr;
        	}
        }
		dif = max-min;
		System.out.println(max);
		System.out.println(min);
		System.out.println(dif);        
		    }

	}


