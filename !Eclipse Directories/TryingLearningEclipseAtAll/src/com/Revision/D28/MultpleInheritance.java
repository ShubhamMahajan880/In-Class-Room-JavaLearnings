package com.Revision.D28;

class companiesInformation
{
	public void companyType()
	{
		System.out.println("companiesInformation.companyCategorization()");
		System.out.println("There are two type of companies we have - ");
	}
}

class ServiceBasedCompanies extends companiesInformation
{
	public void companyType() {
		System.out.println("ServiceBasedCompanies.companyType()");
		System.out.println("Service Based Companies are different and projects based");

	}
}

class ProductBasedCompanies extends companiesInformation
{
	public void companyType() {
		System.out.println("ProductBasedCompanies.companyType()");
		System.out.println("Product Based Companies are consider as best");

	}

}

class MixedCompanies extends ServiceBasedCompanies, ProductBasedCompanies
{

}

public class MultpleInheritance {

	public static void main(String[] args) {
		System.out.println("MultpleInheritance.main()");
		System.out.println("Undetstanding Multiple Inheritance");


	}

}
