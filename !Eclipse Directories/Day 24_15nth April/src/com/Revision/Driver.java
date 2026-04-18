package com.Revision;

public class Driver {

	public static void main(String[] args) {
		Account a1 = new Account();
//		a1.balance = 15000;
		a1.deposit(1500);
		System.out.println(a1.getBalance());

	}

}
