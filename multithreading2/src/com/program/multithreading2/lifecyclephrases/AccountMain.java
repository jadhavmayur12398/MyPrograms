package com.program.multithreading2.lifecyclephrases;

public class AccountMain {
	public static void main(String[] args) {
		ResourceAccount account = new ResourceAccount(5000);
		HusbandThread husbandThread = new HusbandThread(account);
		WifeThread wifeThread = new WifeThread(account);
		
		husbandThread.start();
		wifeThread.start();
	}
}
