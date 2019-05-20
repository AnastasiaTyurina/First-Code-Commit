package com.class28;

public abstract class Marks {
	//We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
	//by student A and in four subjects (each out of 100) by student B. 
	//Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	//It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
	//The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
	//Test your code
	
	void getPercentage() {
		
	}
	

}
class A extends Marks{
	void getPercentage(int a, int b, int c) {
		int total=((a+b+c)*100)/300;
		System.out.println("The percentage of marks obtained by student A is "+total+"%");
	}
	
}
class B extends Marks{
	void getPercentage(int a, int b, int c, int d) {
		int total=((a+b+c+d)*100)/400;
		System.out.println("The percentage of marks obtained by student B is "+total+"%");
	}
}
