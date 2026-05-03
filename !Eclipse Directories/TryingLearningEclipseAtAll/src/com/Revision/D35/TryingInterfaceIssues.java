package com.Revision.D35;

interface ISellingSystem {
	void sales();

	void marketing();

	public static void strategies() {
		System.out.println("SellingSystem.strategies()");
		System.out.println("This is alsmost similar for all, so need to change and write again and again");
	}

	public static void networkingSkills() {
		System.out.println("SellingSystem.networkingSkills()");
		System.out.println("This is a  common message required by everyone, so can be print in one time and then provide reusability");
	}

}

class B2BCompanies implements ISellingSystem {
	@Override
	public void sales() {
		System.out.println("B2BCompanies.sales()");

	}

	@Override
	public void marketing() {
		System.out.println("B2BCompanies.marketing()");
		ISellingSystem.strategies();
	}

}

class B2CCompanies implements ISellingSystem {
	@Override
	public void sales() {
		System.out.println("B2CCompanies.sales()");
	}

	@Override
	public void marketing() {
		System.out.println("B2CCompanies.marketing()");
		ISellingSystem.networkingSkills();
	}
}

public class TryingInterfaceIssues {

	public static void main(String[] args) {
		B2BCompanies bB = new B2BCompanies();
		bB.sales();
		bB.marketing();
		// bB.networkingSkills();
		System.out.println("----------->");

		B2CCompanies bC = new B2CCompanies();
		bC.sales();
		bC.marketing();
	}
}

//B2BCompanies.sales()
//B2BCompanies.marketing()
//SellingSystem.strategies()
//This is alsmost similar for all, so need to change and write again and again
//----------->
//B2CCompanies.sales()
//B2CCompanies.marketing()
//SellingSystem.networkingSkills()
//This is a  common message required by everyone, so can be print in one time and then provide reusability
