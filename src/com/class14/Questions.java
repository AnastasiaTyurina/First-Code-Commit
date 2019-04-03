package com.class14;

public class Questions {

	public static void main(String[] args) {
		// 1. Swap 2 numbers/2 strings without a temporary variable
		int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        String a = "one";
        String b = "two";

        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //2. second largest number in an array, max and min numbers
        int [] array= {100, 56,200, 90, 250, 15, 89, 99, 3000};
        int max=0, secondLargest=0, min=array[0];
        for (int arr:array) {
        	if(arr>max) {
        		max=arr;
        	}
        	if(arr<min) {
        		min=arr;
        	}
        }
        for(int arr:array) {
        	if(arr>secondLargest && arr<max) {
        	secondLargest=arr;	
        	}
        }
        
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
        System.out.println("The second largest number is "+secondLargest);
        
        //3.
        String str1="#$%^RTHRA erijt ioerjt etr^&*6&8978(789";
		int characters;
		String noLetters=str1.replaceAll("[A-Za-z]", "");
		System.out.println(noLetters);
		characters=str1.length()-noLetters.length();
		System.out.println(characters);
		
		//4.
		String str2="Today is Saturday";
		String subString=str2.substring(0, 5);
		System.out.println(subString);
		String [] array2=str2.split(" ");
		System.out.println(array2.length);
		
		//5.
		String str3="Tomorrow is Sunday";
		String reverse1="";
		for (int i=str3.length()-1; i>=0; i--) {
			reverse1=reverse1+str3.charAt(i);	
		}
		System.out.println(reverse1);
		
		String reverse="";
		String[] p=str3.split(" ");
		for(String l:p) {
			for(int i=l.length()-1; i>=0; i--) {
				reverse=(reverse+l.charAt(i));
				
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse);
		
		//6. palindrome
		String str5="madam";
		String reverse5="";
		for (int i=str5.length()-1; i>=0; i--) {
			reverse5=reverse5+str5.charAt(i);
		}
		System.out.println(reverse5);
		if(str5.contentEquals(reverse5)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
		
		//7.
		int q=2;
		if(q%2!=0 && q%3!=0 &&q%5!=0) {
			System.out.println("This is a prime number");
		}else if (q==2) {
			System.out.println("this is a prime number");
		}else {
			System.out.println("This is not a prime number");
		}
		
		//8.fibonacci numbers
		int n1=1, n2=0, n3=0;       
		 for(int i=0; i<10; i++) {    
		  n3=n1+n2;    
		  n1=n2;    
		  n2=n3;
		  System.out.print(n1+" ");
		 }
		
		
		
	}

}
