package com.class19;

public class Student {
	public static void main(String[] args) {
	
	Student a=new Student();
	
	System.out.println(a.getGrade(89));
	}
	String getGrade (int score) {
		String grade;
		if(score>90) {
			grade="A";
		}else if(score>80 && score<=90) {
			grade="B";
		}else if(score>70 && score<=80) {
			grade="C";
		}else if(score>60 && score<=70) {
			grade="D";
		}else {
			grade="F";
		}
		return grade;
	}
}
