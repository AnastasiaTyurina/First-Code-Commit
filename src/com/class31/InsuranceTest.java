package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		Insurance car=new Car("Geico", "Toyota");
		Insurance dog=new Pet("Pet Insurance", "Husky breed");
		Insurance person=new Health("Medicaid");
		
		ArrayList<Insurance> alist=new ArrayList<>();
		alist.add(car);
		alist.add(dog);
		alist.add(person);
		
		for (Insurance list:alist) {
			System.out.println(list.insuranceName);
			list.getQuote();
			list.cancelInsurance();
		}
		Iterator <Insurance>myIt=alist.iterator();
		while(myIt.hasNext()) {
			Insurance obj=myIt.next();
			obj.getQuote();
			obj.cancelInsurance();
		}
		for(int i=0; i<alist.size(); i++) {
			Insurance obj=alist.get(i);
			obj.getQuote();
			obj.cancelInsurance();
		}
		
	}

}
