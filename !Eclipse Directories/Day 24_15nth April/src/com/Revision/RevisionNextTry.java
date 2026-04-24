package com.Revision;

public class RevisionNextTry {

	String tryingString = "try for oibject able t oaccess me or not";
	class ElectricCars {

		String carInfo = "All About Electric Cars";

		public void fuelSystem() {

			System.out.println("There is all options in electric also, depends on us which one we want to use");

		}
	}

	class CurvEv extends ElectricCars {

		public void gearSystem() {
			System.out.println("All Gear Systems available");
			System.out.println("IMT, AMT, MNAUAL");

			CurvEv eV = new CurvEv();
			 System.out.println(eV.carInfo);
			eV.fuelSystem();
		}

	}

	class MahindraBE extends ElectricCars {

		String essentialInfo = "EV dont have number plates";
		public void androidSystem() {
			System.out.println("Multifunctionality OS displays available");

			MahindraBE bE = new MahindraBE();
			System.out.println(bE.carInfo);
			bE.fuelSystem();

		}
	}

class TeslaEV extends MahindraBE
{
	public void speakerSystem() {
		System.out.println("AI DOlby Speaker within the car");

		TeslaEV eV2 = new TeslaEV();
		System.out.println(eV2.essentialInfo);
		eV2.androidSystem();


	}
}
	public static void main(String[] args) {
		RevisionNextTry r1 = new RevisionNextTry();
		System.out.println(r1.tryingString);
		CurvEv e1 = r1. new CurvEv();
		System.out.println(e1.carInfo);
		e1.fuelSystem();
		e1.gearSystem();

		TeslaEV e2 = r1.new TeslaEV();
		System.out.println(e2.carInfo);
		System.out.println(e2.essentialInfo);
		e2.androidSystem();
		e2.speakerSystem();

	}

}
