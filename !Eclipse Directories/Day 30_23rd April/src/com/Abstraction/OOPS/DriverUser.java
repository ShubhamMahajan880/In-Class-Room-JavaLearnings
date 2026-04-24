package com.Abstraction.OOPS;

public class DriverUser {

	public static void main(String[] args) {
		LoginService lS = new LoginService();
		lS.doLogin("Name@1134", "231877***");

		lS.validateIdentity(); // able to use because in the abstracted class we made it public
	}

//	loginService.connectToDB
//	loginService.encryptionPart
//	loginService.promptPasswordReset
//	loginService.validateUser
//	loginService.validateIdentiy

}
