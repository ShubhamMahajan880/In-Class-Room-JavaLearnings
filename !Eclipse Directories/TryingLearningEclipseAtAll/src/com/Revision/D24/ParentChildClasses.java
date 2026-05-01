package com.Revision.D24;

public class ParentChildClasses {
	class BankingSystem {
		String bankName = "BOB";

		public void bankInfo() {
			System.out.println("BankingSystem.bankInfo()");
		}
	}

	class BankBranches extends BankingSystem {

		public void newSystem() {
			System.out.println("ParentChildClasses.BankBranches.newSystem()");
			BankBranches bB = new BankBranches();
			bB.bankName = "SBI";
			System.out.println(bB.bankName);
			bB.bankInfo();

			BankingSystem bS2 = new BankingSystem();
			System.out.println(bS2.bankName);
			bS2.bankInfo();
		}

	}

	public static void main(String[] args) {
		System.out.println("Leanring Inheritance");
		ParentChildClasses pC = new ParentChildClasses();


//		BankingSystem bS = pC.new BankingSystem();
//		bS.bankInfo();
//		System.out.println(bS.bankName);
//
//		BankBranches bB2 = pC.new BankBranches();
//		bB2.bankInfo();
//		System.out.println(bB2.bankName);
//		bB2.newSystem();

	}
}