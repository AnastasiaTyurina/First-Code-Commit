package com.class5;

import java.util.Scanner;

public class Tasks2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz=scanner.nextInt();
		System.out.println("Please enter your midterm score");
		int midterm=scanner.nextInt();
		System.out.println("Please enter your final score");
		int finalScore=scanner.nextInt();
		double average=(quiz+midterm+finalScore)/3;
		
		if(average>=90) {
			System.out.println("GradeA");
		}else if (average>=70 && average<90) {
			System.out.println("Grade B");
		}else if (average>=50 && average<70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}
		

	}

}
