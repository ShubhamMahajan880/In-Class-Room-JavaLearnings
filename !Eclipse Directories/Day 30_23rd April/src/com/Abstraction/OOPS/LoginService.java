package com.Abstraction.OOPS;

public class LoginService {
	public boolean doLogin(String userId, String _pwd) {
		// Abstract Part -
		// connect with database
		// Do Encryption
		// Business logic to validate user

		connectToDB();
		encryptionPart();
		promptPasswordReset();
		validateUser();

		return true;
	}

	//Should not expose this part...this is private for other classes and users.

	private void connectToDB() {
		System.out.println("loginService.connectToDB");
	}

	private void encryptionPart() {
		System.out.println("loginService.encryptionPart");
	}

	private void promptPasswordReset() {
		System.out.println("loginService.promptPasswordReset");
	}

	public void validateUser() {
		System.out.println("loginService.validateUser");
	}	 // by making all these functionalities private .. we are not allowing any one to accessing or modyfing this. and by making the class private, ensuring that anyone can signup and enter their userID and password.

	public void validateIdentity() {
		System.out.println("loginService.validateIdentiy");
	}	 // by making any particular method public, we are allowing to other classes/parties to accessing this method from outside also.

}
