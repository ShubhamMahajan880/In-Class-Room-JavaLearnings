package com.Revision;
import in.mahajanDevelopers.*;

public class CheckingAccessModifiers {

	public static void main(String[] args) {
		System.out.println("Checking here for accessing the methods of other classes of different Pakcage");
		AccessModifiers a = new AccessModifiers();
		a.tryingToAccess();
		System.out.println("Checked file from different package succsssfully");
	}

}
