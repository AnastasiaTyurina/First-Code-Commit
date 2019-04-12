package com.JavaReview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int c=0,a,temp;  
	    int n=153;
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  //3 //5 //1
	    n=n/10;  //15 //1 //0
	    c=c+(a*a*a); //27 //27+125=152 //153
	    }  
	    if(temp==c) { 
	    	System.out.println("armstrong number");   
	    }else { 
	        System.out.println("Not armstrong number");   
	    }
	}

}
