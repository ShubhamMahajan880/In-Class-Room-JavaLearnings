package com.Revision.D42;

public class A4_MultipleTryMutipleCatchsExecutingTogether {

	public static void main(String[] args) {
		System.out.println("A4_MultipleTryMutipleCatchsExecutingTogether.main() - START");

		try {
			String name = null;
			System.out.println(name.length());
		}

		catch (NullPointerException e) {
			System.out.println("Null Exception");
		}

		try {
			String userDetails = args[0];
			System.out.println(userDetails);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Command line argument missing");
		}

		try {
			int number = 10 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("All Catch blocks performed successfully " + i);
		}

		System.out.println("A4_MultipleTryMutipleCatchsExecutingTogether.main() - END");
	}

}
