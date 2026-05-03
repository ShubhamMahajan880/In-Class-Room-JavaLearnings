package com.Revision.D27;

class StandAloneBuildings {
	protected int RowHouses(int rentValue, String additionalCoverage) {
		System.out.println("StandAloneBuildings.RowHouses()");

		return rentValue;
	}
}

class ApartmentRentals extends StandAloneBuildings {
	@Override
	public int RowHouses(int rentValue, String additionalCoverage) {
		System.out.println("ApartmentRentals.RowHouses()");
		return rentValue;
	}
}

public class LearningOverriding {
	public static void main(String[] args) {
		System.out.println("Implementing Overridng rules here - ");
	}

	StandAloneBuildings sA = new StandAloneBuildings();

}
