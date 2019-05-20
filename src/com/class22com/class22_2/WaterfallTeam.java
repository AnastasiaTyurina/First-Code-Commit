package com.class22com.class22_2;

import com.class22.Employee;

public class WaterfallTeam extends Employee {

	public static void main(String[] args) {
		
		WaterfallTeam wt=new WaterfallTeam();
		wt.salary=90000; // public
		wt.salary1=100000; // protected
		wt.test();
		// wt.test1(); default is not available
		// child can have only one parent from a class - can only extend one class
	}

}
