package com.Revision.D42.customExceptionhandling.practise;

public class Driver1 {

	public static void main(String[] args) {

		String enteringPassword = args[0];
		CreatingPassword cP = new CreatingPassword();

		try {
			System.out.println("Driver1.main() - START");
			cP.passwordCreation(enteringPassword);

			System.out.println("Driver1.main() - afte risky line of try block");
		} catch (PasswordNotValidException e) {
			e.printStackTrace();
			System.out.println("so, you got the result as per your password");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Driver1.main() - END");
		}

	}

	/*	Driver1.main() - START
		com.Revision.D42.customExceptionhandling.practise.PasswordNotValidException: Generated Password - suhu#@2qe456 is not valid
			at com.Revision.D42.customExceptionhandling.practise.CreatingPassword.passwordCreation(CreatingPassword.java:9)
			at com.Revision.D42.customExceptionhandling.practise.Driver1.main(Driver1.java:12)
		so, you got the result as per your password
	*/

}
