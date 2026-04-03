package com.kodewala.objects;

class CarInfo {
	int cost;
	String companyName;
	String categoryType;

	public CarInfo(int _cost, String _companyName, String _categoryType) {
		System.out.println("I am calling to Car Class with values - (Cost, whichCompanyCar, carrCategory)");
		// Intit
		this.cost = _cost;
		this.companyName = _companyName;
		this.categoryType = _categoryType;
	}
}

public class Car {
	public static void main(String[] args) {

		CarInfo C0 = new CarInfo(15, "HundaiCreta", "AutomaticeManualTransmission");
		System.out.println("Car C0 Details arew as following  - ");
		System.out.println("COst is  - " + C0.cost);
		System.out.println("Comoany is  - " + C0.companyName);
		System.out.println("caegory  is  - " + C0.categoryType);

		CarInfo C1 = new CarInfo(25, "MercedezzBenz", "ManualTransimission");
		System.out.println("Car C1 Details arew as following  - ");
		System.out.println("COst is  - " + C1.cost);
		System.out.println("Comoany is  - " + C1.companyName);
		System.out.println("caegory  is  - " + C1.categoryType);

		CarInfo C2 = new CarInfo(50, "KiaSonet", "IntegratedManualTransmission");
		System.out.println("Car C2 Details arew as following  - ");
		System.out.println("COst is  - " + C2.cost);
		System.out.println("Comoany is  - " + C2.companyName);
		System.out.println("caegory  is  - " + C2.categoryType);

	}
}
