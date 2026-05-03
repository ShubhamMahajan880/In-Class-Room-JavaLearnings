package com.Revision.D30;

public class UserDetails {
	public void professionalInfoOnly(String userName, int userJobID) {
		System.out.println("UserDetails.professionalInfoOnly()");
		System.out.println("Name of the employee is - " + userName);
		System.out.println("Job Id of the user is - " + userJobID);
	}

	private void userAge() {
		System.out.println("UserDetails.userAge()");
		System.out.println("This is users persoal info, None of your business");
	}

	private void userFamilyDetails() {
		System.out.println("UserDetails.userFamilyDetails()");
		System.out.println("Family is of user's not yours .. so no need to know");

	}

	private void userHomeCity() { // personal info of user so, not having access to all.
		System.out.println("UserDetails.userHomeCity()");
		System.out.println("From where the user actally belings too...");
	}

	public void companyLocationAllotedtoUser(String companyOffice) { // its public and essential info to know for administration or evceryone so its public
		System.out.println("UserDetails.companyLocationAllotedtoUser()");
		System.out.println("We gave our companies new office, which is in " + companyOffice);
	}
}
