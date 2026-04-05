package com.revision;

class MeditationCenter {
	public MeditationCenter() {
		System.out.println("Dfauly Constructor working properly");
	}

	int centerNumber;
	String centerName;
	String centerAddress;
	int personAllowed;

	public MeditationCenter(int _centerNumber, String _centerName, String _centerAddress)

	{
		this(_centerNumber, _centerName, _centerAddress, 90);

	}

	public MeditationCenter(int _centerNumber, String _centerName, String _centerAddress, int _personAllowed) {
		this.centerNumber = _centerNumber ;
		this.centerName = _centerName;
		this.centerAddress = _centerAddress;
		this.personAllowed = _personAllowed;
	}
}

public class Revision2 {

	public static void main(String[] args) {
		System.out.println("Learning about using this and super with cosntructor overloading");

		MeditationCenter mC = new MeditationCenter();
		System.out.println("Calling to Default Constructor first automatically - ");

		MeditationCenter mC2 = new MeditationCenter(45, "BrahmKumaris", "Bangalore");
		System.out.println("Details for Meditation center 2 as fillwing - " + mC2.centerNumber);
		System.out.println("Details for Meditation center 2 as fillwing - " + mC2.centerName);
		System.out.println("Details for Meditation center 2 as fillwing - " + mC2.centerAddress);
		System.out.println("Details for Meditation center 2 as fillwing - " + mC2.personAllowed);

	}

}
