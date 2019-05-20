package com.class23;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTime ft=new FullTime();
		Contractor contractor=new Contractor();
		
		emp.getPaid();
		ft.getPaid();
		contractor.getPaid();
	}

}
