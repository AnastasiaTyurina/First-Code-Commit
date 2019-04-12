package com.class20;

public class Employee {
	
		public String eID;
		public int salary;
		public static String CEO="Sumair";
	public static void main(String[] args) {
		
		
		
		Employee empl1=new Employee();
		Employee empl2=new Employee();
		
		empl1.eID="ABC";
		empl1.salary=60000;
		
		empl2.eID="DEF";
		empl2.salary=70000;
		
		System.out.println(empl1.eID);
		System.out.println(empl1.salary);
		System.out.println(Employee.CEO);
		System.out.println(empl2.eID);
		System.out.println(empl2.salary);
		System.out.println(Employee.CEO);
	}

}
