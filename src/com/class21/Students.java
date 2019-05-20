package com.class21;

public class Students {
	
	String studentName;
	int studentgrade1, studentgrade2, studentgrade3, averageGrade;
	
	
	public Students (String name, int grade1, int grade2, int grade3) {
		studentName=name;
		studentgrade1=grade1;
		studentgrade2=grade2;
		studentgrade3=grade3;
	
	}
	public void studentInfo() {
		averageGrade=(studentgrade1+studentgrade2+studentgrade3)/3;
		String info="My name is "+studentName+" and my average grade is "+averageGrade;
		System.out.println(info);
	}

}
