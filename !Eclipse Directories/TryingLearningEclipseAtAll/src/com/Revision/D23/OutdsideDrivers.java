package com.Revision.D23;

public class OutdsideDrivers {

	public static void main(String[] args) {
		EncapsulationsWorking eW = new EncapsulationsWorking();
//		 eW.bankBalance = 1000;

		System.out.println("Newly added bank balance is " + eW.gettingBalance());

		eW.settingBalance(45000);
		System.out.println("Newly added bank balance is " + eW.gettingBalance());

	}

}
