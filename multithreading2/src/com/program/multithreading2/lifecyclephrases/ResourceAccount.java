package com.program.multithreading2.lifecyclephrases;

public class ResourceAccount {
	double accountBalance;
	
	public ResourceAccount(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	public void checkBalance() {
		System.out.println(accountBalance);
	}
	public void deposit (double amount) {
		accountBalance += amount;
		checkBalance();
	}
	public void withdraw(double amount) {
		if (accountBalance >= amount) {
			accountBalance -= amount;
			checkBalance();
		}
		else {
			System.out.println("Insufficient Balance...");
		}
	}
}
