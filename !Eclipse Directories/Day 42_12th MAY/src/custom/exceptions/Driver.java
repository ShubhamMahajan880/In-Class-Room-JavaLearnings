package custom.exceptions;



public class Driver {
	public static void main(String[] args) {
		String email = args[0];

		UserRegistration uR = new UserRegistration();
		try {
			uR.regsiterUser(email); // risky part - email could be already registered, so checking here.
		} catch (EmailAlreadyExistsException e) { // sepcifically created exception based on the action
			e.printStackTrace();
			System.out.println("Email is already registered with us, please try with different one");
		}
		catch (Exception e ) // standard universal parent exception, if you'll execute thisd only then it won;t rhrow desired error as per rewuuirement.
		{
			e.printStackTrace();
			System.out.println("It's END");
		}
	}

	/*
	 * Developer developer his own exception which is throwing error as per -

	 * rewuirements and condnitions - custom.exceptions.EmailAlreadyExistsException:
	 * Email id - shubhammahajan400@gmail.com already registered at
	 * custom.exceptions.UserRegistration.regsiterUser(UserRegistration.java:15) at
	 * custom.exceptions.Driver.main(Driver.java:11) Email is already registered
	 * with us, please try with different one
	 */

}
