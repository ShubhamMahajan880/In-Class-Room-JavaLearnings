package com.Revision.D42.customExceptionhandling.practise;

public class PasswordNotValidException extends Exception{
	public PasswordNotValidException(String generatePassword) {
		super(generatePassword);
	}
}
