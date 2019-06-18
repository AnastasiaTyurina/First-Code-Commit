package com.JavaReview;

public class ExceptionsReview {

	void arithmetic(int a, int b) {
		System.out.println(a/b);
	}
	void nullPointer() {
		System.out.println("Null Pointer Exception");
		ExceptionsReview obj = new ExceptionsReview();
		obj=null;
		obj.arithmetic(2, 1);
	}
	void stringIndexOutOfBounds() {
		System.out.println("String Index Out Of Bounds Exception");
		String str="Hi students";
		char chr=str.charAt(20);
		}
	void arrayIndexOutOfBounds() {
		System.out.println("Array Index Out Of Bound Exception");
		int [] arr= new int[5];
		arr[6]=3;
	}
	void negativeArraySizeException() {
		System.out.println("Negative Array Size Exception");
		int[] arr=new int[-5];
	}
	Throwable throwsMethod() throws Exception {
		System.out.println("Exception");
		throw new Exception();
	}
}
