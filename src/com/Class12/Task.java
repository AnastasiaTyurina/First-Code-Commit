package com.Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		String username;
		String password;
		String confirmedPassword="898989575757";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter username");
		username=scan.nextLine();
		System.out.println("Please enter password");
		password=scan.nextLine();
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");		
		} else {
			if(password.length()<=8) {
				System.out.println("Password is too short");
			} else {
				if(password.contains(username)) {
					System.out.println("Password cannot contain username");
				} else {
					if(password.equals(confirmedPassword)){
						System.out.println("Your username and password have been created");
				} else {
					System.out.println("Passwords do not match");
				}
					
				}
			}
		}

	}

}
