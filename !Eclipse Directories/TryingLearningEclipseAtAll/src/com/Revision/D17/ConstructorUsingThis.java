package com.Revision.D17;

class CarsInfromation {
	public CarsInfromation() {
		System.out.println("CarsInfromation.CarsInformation()");
		System.out.println("Calling to me i am default constructor");
	}

	String carName;
	String carCompany;
	int carPrice;
	double carRating;
	String carNumber;
	String finalDecision;

	public CarsInfromation(String _carName, String _carCompany, int _carPrice, double _carRating, String _carNumber) {
		this(_carName, _carCompany, _carPrice, _carRating, _carNumber, "Yes Definitely");
	}

	public CarsInfromation(String _carName, String _carCompany, int _carPrice, double _carRating, String _carNumber,
			String _finalDecision) {

		this.carName = _carName;
		this.carCompany = _carCompany;
		this.carPrice = _carPrice;
		this.carRating = _carRating;
		this.carNumber = _carNumber;
		this.finalDecision = _finalDecision;

	}
}

public class ConstructorUsingThis {

	public static void main(String[] args) {
		System.out.println("ConstructorUsingThis.main()");
		System.out.println("Default Constructor call");

		CarsInfromation cI = new CarsInfromation("BE6", "Mahindra", 15, 5.5, "AWS111109");
		System.out.println("Car name is - " + cI.carName);
		System.out.println("Car's Company is - " + cI.carCompany);
		System.out.println("Car's Price is - " + cI.carPrice);
		System.out.println("Car's rating is - " + cI.carRating);
		System.out.println("Car's Number is - " + cI.carNumber);
		System.out.println("Car's Final Decision  is - " + cI.finalDecision);

	}

}
