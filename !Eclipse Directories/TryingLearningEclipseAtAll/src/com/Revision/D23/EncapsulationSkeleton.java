package com.Revision.D23;

class EncapsulationsWorking {
	private int bankBalance = 1000;

	public void settingBalance(int _newBalance) {
		this.bankBalance = _newBalance;
	}

	public int gettingBalance() {
		return bankBalance;
	}

	public static void main(String[] args) {

		System.out.println("EncapsulationsWorking.main()");
	}
}