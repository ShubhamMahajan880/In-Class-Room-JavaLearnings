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
		this(_carName, _carCompany, _carPrice, _carRating, _carNumber, "Yes Definitely"); // this is helpoing me in creating different parameters of cosntructor itslef, thats it
	}

	/*our main work is her to checking the formaitting issuesand and how ts
	the commneyed issues tesolved ot not agfyter this kuch settings
	I am writitng this all to jjyst check only thenwill remove all
	*/
	public CarsInfromation(String _carName, String _carCompany, int _carPrice, double _carRating, String _carNumber,
			String _finalDecision) { // passijg a rgumenets inside construcotr is really a good thing and provides us helo in directly object creation

		this.carName = _carName;
		this.carCompany = _carCompany;
		this.carPrice = _carPrice;
		this.carRating = _carRating;
		this.carNumber = _carNumber;
		this.finalDecision = _finalDecision;

		//		passijg a rgumenets inside construcotr is really a good thing and provides us helo in directly object creation and we aallcan do this eadily tyo undrrsyanding of onject creatiins ussing eclipse in the prigramming thanks

		/*to gthe hava deveklioer whi had and doing greta
		already feveliopeedthis and gavce us this
		much confoirtabuikutyh anfd facikiutres*/
	}
}

public class ConstructorUsingThis {

	public static void main(String[] args) {
		System.out.println("ConstructorUsingThis.main()");
		System.out.println("Default Constructor call");

		CarsInfromation cI = new CarsInfromation("BE6", "Mahindra", 15, 5.5, "AWS111109"); // passijg a rgumenets inside construcotr is really a good thing and provides us helo in directly object creation
		System.out.println("Car name is - " + cI.carName);
		System.out.println("Car's Company is - " + cI.carCompany);
		System.out.println("Car's Price is - " + cI.carPrice);
		System.out.println("Car's rating is - " + cI.carRating);
		System.out.println("Car's Number is - " + cI.carNumber);
		System.out.println("Car's Final Decision  is - " + cI.finalDecision);

		/*our main work is her to checking the formaitting issuesand
		the commneyed issues tesolved ot not agfyter this kuch settings
		I am writitng this all to jjyst check only thenwill remove all*/

		//		I thinkk, i;ve done the good thingg and customixzations of eclipse in my own language, this is the ebwst setup i ma building fo checking all the escaxcr functinaltiires of vcs code it willl guv emth that priote coding waala fewel and i will be able to do mucgh better. Hoping ythr besr anfd mobif foewarsd

		/*I thinkk, i;ve done the good thingg and customixzations of eclipse in my own language,
		this is the ebwst setup i ma building fo checking all the escaxcr functinaltiires of vcs code
		it willl guv emth that priote coding waala fewel and i will be able to do mucgh better.
		Hoping ythr besr anfd mobif foewarsd*/
	}

}
