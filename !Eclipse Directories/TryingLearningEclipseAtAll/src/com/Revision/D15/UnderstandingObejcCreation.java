package com.Revision.D15;

class HinduFestivals {
	String festivalName;
	String festivalHype;
	int monthofFestival;
	int daysofCelebration;
	String festivalWaiting;

	public HinduFestivals() {
		System.out.println("This is Default COnstructor of crrated class");
	}

	public HinduFestivals(String _festivalName, String _festivalHype, int _monthofFestival, int _daysofCelebration,
			String _festivalWaiting) {
		this.festivalName = _festivalName;
		this.festivalHype = _festivalHype;
		this.monthofFestival = _monthofFestival;
		this.daysofCelebration = _daysofCelebration;
		this.festivalWaiting = _festivalWaiting;

	}

}

public class UnderstandingObejcCreation {

	public static void main(String[] args) {
		System.out.println("Learning about object creation and Construcror");

		System.out.println("Doing Object creation for above class");
		HinduFestivals hF = new HinduFestivals();
		System.out.println("After Object creation Default constructor created successfully");

		System.out.println("Trying with new object creation");
		HinduFestivals hF2 = new HinduFestivals("RakshaBandhan", "Great", 8, 2, "Decent");

		System.out.println("Printing all information related to festival season");
		System.out.println("Name of the festival is  - " + hF2.festivalName);
		System.out.println("Hype of the festival is  - " + hF2.festivalHype);
		System.out.println("No of days to celebrate festival is  - " + hF2.daysofCelebration);
		System.out.println("Waiting of the festival is  - " + hF2.festivalWaiting);

	}

}
