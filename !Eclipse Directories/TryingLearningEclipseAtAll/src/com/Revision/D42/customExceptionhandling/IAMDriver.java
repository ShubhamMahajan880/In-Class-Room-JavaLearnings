package com.Revision.D42.customExceptionhandling;

public class IAMDriver {

	public static void main(String[] args) {

		String userActualName = args[0];
		UserRegistrationDetails uR = new UserRegistrationDetails();

		try {
			uR.registerUser(userActualName);
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println("User vatification done and the result has thrown");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("I am responsible for exception e waala exception");
		}

	}

	/* When i am entering user name in arguements  -

	com.Revision.D42.customExceptionhandling.UserAlreadyExistsException: user name - Shubhaamis already exists in the db
	at com.Revision.D42.customExceptionhandling.UserRegistrationDetails.registerUser(UserRegistrationDetails.java:12)
	at com.Revision.D42.customExceptionhandling.IAMDriver.main(IAMDriver.java:12)
	User vatification done and the result has thrown

	 */

}
