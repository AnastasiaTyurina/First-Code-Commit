package com.class28;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration obj=new Registration();
		obj.setEmail("anastasia.tyurina@gmail.com");
		obj.setUserName("anastasia666");
		obj.setPassword("789546788");
		
		System.out.println(obj.getEmail());
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());

	}

}
