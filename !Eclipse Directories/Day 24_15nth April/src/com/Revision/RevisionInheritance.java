package com.Revision;


public class RevisionInheritance {

	class AccountMgmt // Parent of Account Class
	{
		String ifscCode = "barb0khargo";

		public void doFundTransfer() {
			System.out.println("AccountMagmt.doFundTranser()...500 lines");

		}
	}

	class Account extends AccountMgmt {
		public void pay() {
			Account account = new Account();
			System.out.println(account.ifscCode);// re-using the parent class attributes in child class.
			account.doFundTransfer();// we are re-using parent class method

		}
	}

	public static void main(String[] args) {
		System.out.println("Inheritance Understanding - ");
//		Inheritance iH = new Inheritance();
//		Account a1 = iH.new Account();
//		AccountMgmt aM1 = new AccountMgmt() ;
//		String ifscCode = aM1.ifscCode;
//		System.out.println(ifscCode);
		RevisionInheritance rI1 = new RevisionInheritance();
		Account a1 = rI1.new Account();
		a1.pay();


	}

}