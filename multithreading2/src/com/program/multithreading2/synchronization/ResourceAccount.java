package com.program.multithreading2.synchronization;

public class ResourceAccount {
	double accountBalance;
	public ResourceAccount (double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	public void checkBalance() {
		System.out.println(accountBalance);
	}
	public synchronized void deposit (double amount) {
		accountBalance += amount;
		checkBalance();
	}
	public synchronized void withdraw(double amount) {
		if (accountBalance>=amount) {
			accountBalance -= amount;
			checkBalance();
		} else {
			System.out.println("Insufficient Balance...");
		}
	}
}
