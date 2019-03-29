package com.class10;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		// guessing game
		// number between 1 and 20
		Scanner scan;
		int secret, userNum;
		secret=13;
		scan=new Scanner(System.in);
		System.out.println("guess the number");
		do {
			
			userNum=scan.nextInt();
			if(userNum<secret) {
				System.out.println("Too small. Guess again");
			}else if(userNum>secret) {
				System.out.println("Too large. Guess again");
			}else {
				
			}
		}	while(secret!=userNum);
		System.out.println("Congratulations! Your guess is correct");
		

	}

}
