package com.Revision.D16;

class ElectricCars {

	String carName;
	String carBrand;
	float carRating;
	String carModel;
	int carPriceinLakhs;
	String myOpinion;

	public ElectricCars() {
		System.out.println("Default COnstruictor - ElectricCars.ElectricCars()");
	}

	public ElectricCars(String _carName, String _carBrand, float _carRating, String _carModel) {
		this.carName = _carName;
		this.carBrand = _carBrand;
		this.carRating = _carRating;
		this.carModel = _carModel;
	}

	public ElectricCars(String _carName, String _carBrand, float _carRating, String _carModel, int _carPriceinLakhs) {
		this.carName = _carName;
		this.carBrand = _carBrand;
		this.carRating = _carRating;
		this.carModel = _carModel;
		this.carPriceinLakhs = _carPriceinLakhs;
	}

	public ElectricCars(String _carName, String _carBrand, float _carRating, String _carModel, int _carPriceinLakhs,
			String _myPersonalOpinion) {
		this.carName = _carName;
		this.carBrand = _carBrand;
		this.carRating = _carRating;//here we are pasing all parameters inside the consteuctor which will help in taking the values as in object form
		this.carModel = _carModel;
		this.carPriceinLakhs = _carPriceinLakhs;
		this.myOpinion = _myPersonalOpinion;
	}

}

public class ConstructorOverloadingRevision {

	public static void main(String[] args) {
		System.out.println("ConstructorOverloadingRevision.main()");

		System.out.println("Object creation for respective class");
		ElectricCars eC = new ElectricCars();
		System.out.println("Called to Default Constructor");
		System.out.println("------------------->");

		System.out.println("Creating Objects of the classs - ");

		ElectricCars eC2 = new ElectricCars("Nexon", "TATA", 5.5f, "tataNexonEV");// here we are pasing all parameters inside the consteuctor which will help in taking the values as in object form
		System.out.println("Infor for eC2 are  - ");
		System.out.println("Name of the car is - " + eC2.carName);
		System.out.println("Brand of the car is - " + eC2.carBrand);
		System.out.println("Ratings of the car is - " + eC2.carRating);
		System.out.println("Model of the car is - " + eC2.carModel);

		System.out.println("------------------->");

		System.out.println("Simialrly for next object ");
		ElectricCars eC3 = new ElectricCars("Curv", "TATA", 10.10f, "tataCurv.EV", 15);
		System.out.println("Printing Info for eC3 object as - ");
		System.out.println("Name of the car is - " + eC3.carName);
		System.out.println("Brand of the car is - " + eC3.carBrand);
		System.out.println("Ratings of the car is - " + eC3.carRating);
		System.out.println("Model of the car is - " + eC3.carModel);
		System.out.println("price of the car is - " + eC3.carPriceinLakhs);

		System.out.println("------------------->");
		System.out.println("Moving foreard with one more object creation ");
		ElectricCars eC4 = new ElectricCars("BE6", "MAHINDRA", 100.100f, "mahindraBE6.EV", 20, "Defintely Take");
		System.out.println("Simialry for ths last object, infoi as - ");
		System.out.println("Printing Info for eC4 object as - ");
		System.out.println("Name of the car is - " + eC4.carName);
		System.out.println("Brand of the car is - " + eC4.carBrand);
		System.out.println("Ratings of the car is - " + eC4.carRating);
		System.out.println("Model of the car is - " + eC4.carModel);
		System.out.println("price of the car is - " + eC4.carPriceinLakhs);
		System.out.println("My Personal Opinion of the car is - " + eC4.myOpinion);

		System.out.println("------------------->");
	}

}
