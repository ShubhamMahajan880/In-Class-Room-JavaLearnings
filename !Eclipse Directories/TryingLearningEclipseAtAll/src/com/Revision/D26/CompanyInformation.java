package com.Revision.D26;

class MainCompany {
	public void companyType() {
		System.out.println("MainCompany.companyType()");
		System.out.println("This is a Service Based Company");
	}

	public void companyInformation()
	{
		System.out.println("MainCompany.companyInformation()");
	}
}

class PayrollCompany extends MainCompany {
	@Override
	public void companyType() {
		System.out.println("PayrollCompany.companyType()");
		System.out.println("This is Product Based Company where we got the chance to work for");

	}
}

public class CompanyInformation {
	public static void main(String[] args) {
		System.out.println("CompanyInformation.main()");
		MainCompany mC = new MainCompany();
		mC.companyType();

		PayrollCompany pC = new PayrollCompany();
		pC.companyType();
		pC.companyInformation();
	}
}