package com.Revision.D42.customExceptionhandling;

public class UserAlreadyExistsException extends Exception {
	public UserAlreadyExistsException(String userName) {
		super(userName);
	}
}
