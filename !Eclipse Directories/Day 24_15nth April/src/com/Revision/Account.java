package com.Revision;

public class Account {

	private int balance = 1000;

	public void deposit(int _amount) {
		if (_amount > 0) {
			balance = balance + _amount;
		} else {
			System.out.println("Invalid Amount can'r print");
		}

	}

	public int getBalance() {

		return balance;
	}

}
