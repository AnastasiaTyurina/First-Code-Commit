package com.JavaReview;

public class ExceptionsReviewTest {

	public static void main(String[] args) {
		
		ExceptionsReview obj=new ExceptionsReview();
		try {
		obj.arithmetic(10, 0);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage()); 
		}
		try {
			obj.arrayIndexOutOfBounds();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of BOunds Exception");
			System.out.println(e.getMessage());
		}
		try {
			obj.stringIndexOutOfBounds();
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds Exception");
			System.out.println(e.getMessage());
		}
		try {
			obj.nullPointer();
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
			System.out.println(e.getMessage());
		}
		try {
			obj.negativeArraySizeException();
		}catch(NegativeArraySizeException e) {
			System.out.println("Negative Array Size Exception");
			System.out.println(e.getMessage());
		}
		try {
			obj.throwsMethod();
		}catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("All exceptions are caught");
		}
	}
}
