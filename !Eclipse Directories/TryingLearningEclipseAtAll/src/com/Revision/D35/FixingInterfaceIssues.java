package com.Revision.D35;

interface ISellingSystem2 {
	void sales2();

	void marketing2();

	public static void strategies2() {
		System.out.println("SellingSystem.strategies()");
		System.out.println("This is alsmost similar for all, so need to change and write again and again");
	}

	public static void networkingSkills2() {
		System.out.println("SellingSystem.networkingSkills()");
		System.out.println("This is a  common message required by everyone, so can be print in one time and then provide reusability");
	}

	private static void digitalAssets() // by changing version to java 9, we can fix it.
	{
		System.out.println("ISellingSystem2.digitalAssets()");
		System.out.println("These are some personal digitsl assets which will be using again and again");
	}

	private static void customerCaring(); // by changing version to java 9, we can fix it.
	{
		System.out.println("ISellingSystem2.enclosing_method()");
		System.out.println("This is also same and similar");
	}

}

class B2BCompaniesAgain implements ISellingSystem2 {
	@Override
	public void sales2() {
		System.out.println("B2BCompanies.sales2()");

	}

	@Override
	public void marketing2() {
		System.out.println("B2BCompanies.marketing2()");
		ISellingSystem2.strategies2();
	}

}

class B2CCompaniesAgain implements ISellingSystem2 {
	@Override
	public void sales2() {
		System.out.println("B2CCompanies.sales2()");
	}

	@Override
	public void marketing2() {
		System.out.println("B2CCompanies.marketing2()");
		ISellingSystem2.networkingSkills2();
	}
}

public class FixingInterfaceIssues {

}
