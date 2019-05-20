package com.class25;

public class Bank {

	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	int getBalance() {
		return 1000;
	}
}
class BankB extends Bank{
	int getBalance() {
		return 1500;
	}
}
class BankC extends Bank{
	int getBalance() {
		return 2000;
	}
}