package custom.exceptions;

import java.io.IOException;

public class UserRegistration {

	public boolean regsiterUser(String _email) throws EmailAlreadyExistsException, IOException, Exception
	{
		String email = _email;

		// logic to check the email...with DB and if already available the return true;
		boolean isEmailRegistered = true;
		if(isEmailRegistered)
		{
			throw new EmailAlreadyExistsException(" Email id - "+email+" already registered" );
			// new Person("test");
		}
		return true;
	}
}
