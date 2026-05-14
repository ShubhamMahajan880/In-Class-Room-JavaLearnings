package com.Revision.D42.customExceptionhandling.practise;

public class CreatingPassword {

	public boolean passwordCreation(String _passwordGeneration) throws PasswordNotValidException {
		String passwordGeneration = _passwordGeneration;

		if (true) {
			throw new PasswordNotValidException("Generated Password - " + passwordGeneration + " is not valid");
		}

		return true;
	}

}
