package com.revision;

class MobileInfo {
	String mobileName;
	String mobileCompany;
	int mobilePrice;
	int mobileRam;
	String mobileOS;

	public MobileInfo() {
		System.out.println("Accessing to default contructor");
	}

	public MobileInfo(String _mobileName, String _mobileCompany, int _mobilePrice) {
		this.mobileName = _mobileName;
		this.mobileCompany = _mobileCompany;
		this.mobilePrice = _mobilePrice;
	}

	public MobileInfo(String _mobileName, String _mobileCompany, int _mobilePrice, int _mobileRam, String _mobileOS) {
		this.mobileName = _mobileName;
		this.mobileCompany = _mobileCompany;
		this.mobilePrice = _mobilePrice;
		this.mobileRam = _mobileRam;
		this.mobileOS = _mobileOS;
	}

}

public class Revision2ConstructorOverloading {

	public static void main(String[] args) {
		System.out.println("Learning about construvtor overloading");

		MobileInfo mB  = new MobileInfo();

		MobileInfo mB1 = new MobileInfo("Z9SPRO", "IQ", 25000);
		System.out.println("Details for Mobile 1 as following - ");
		System.out.println("Name of the mobile 1 is - " + mB1.mobileName);
		System.out.println("company of mobile 1 is - " + mB1.mobileCompany);
		System.out.println("price of mobile 1 is - " + mB1.mobilePrice);

		MobileInfo mB2 = new MobileInfo("Note10S", "Redmi", 15000, 8, "Functouch OS");
		System.out.println("Details for Mobile 2  as following - ");
		System.out.println("Name of the mobile 2  is - " + mB2.mobileName);
		System.out.println("company of mobile  2 is - " + mB2.mobileCompany);
		System.out.println("price of mobile 2 is - " + mB2.mobilePrice);
		System.out.println("Ram of the mobile is - " + mB2.mobileRam);
		System.out.println("OS of the mobile 2 is - " + mB2.mobileOS);

	}

}
