package com.program.multithreading2.lifecyclephrases;

public class HusbandThread extends Thread{
	ResourceAccount resourceAccount;

	public HusbandThread (ResourceAccount resourceAccount) {
		this.resourceAccount = resourceAccount;
	}
	public void run() {
		resourceAccount.deposit(1000);
		resourceAccount.withdraw(500);
	}
}
