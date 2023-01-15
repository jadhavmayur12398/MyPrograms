package com.program.multithreading2.lifecyclephrases;

public class WifeThread extends Thread{
	ResourceAccount resourceAccount;

	public WifeThread(ResourceAccount resourceAccount) {
		this.resourceAccount = resourceAccount;
	}
	public void run() {
		resourceAccount.deposit(1500);
		resourceAccount.withdraw(1500);
	}
}
