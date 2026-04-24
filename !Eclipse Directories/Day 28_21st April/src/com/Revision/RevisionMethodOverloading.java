package com.Revision;

class Kia {
	public void funcitionalities(String carName) {
		System.out.println("Name of the car is - " + carName);
	}

	public void functionalities(String carName, int carPrice) {
		System.out.println("Car name is - " + carName);
		System.out.println("Price of this car is - " + carPrice);
	}

	public void functionalities(double inYearManintanance, String carServices, int carResellingPrice) {
		System.out.println("this car need maintainace in every - " + inYearManintanance + "years");
		System.out.println("Services in  the car are - " + carServices);
		System.out.println("Car can be resell in - " + carResellingPrice);

	}
}

public class RevisionMethodOverloading {
	public static void main(String[] args) {
		Kia k = new Kia();
		k.funcitionalities("SONET");
		k.functionalities("SELTOS NEW EDITION", 15);
		k.functionalities(2.2, "Full Services as renew", 10);

	}
}
