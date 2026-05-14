package com.Revision.D42.customExceptionhandling;

public class UserRegistrationDetails  {

	public boolean registerUser(String _userName) throws UserAlreadyExistsException
	{
		String userName = _userName;

		boolean isUserRegistered = true;
		if(isUserRegistered)
		{
			throw new UserAlreadyExistsException("user name - "+userName+"is already exists in the db");
		}
		return true;
	}
}
