package com.Revision.D39;

public class A3_NumberFormatException {

	public static void main(String[] args) {
		String myNumber = args[0];

		int intNumber = Integer.parseInt(myNumber);

		System.out.println("Number is - " + intNumber);

	}
	/*Number Format Esxcdption -
	Exception in thread "main" java.lang.NumberFormatException: For input string: "shubhammahakan"
		at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		at java.lang.Integer.parseInt(Integer.java:580)
		at java.lang.Integer.parseInt(Integer.java:615)
		at com.Revision.D39.A3_WrongDatatypeException.main(A3_WrongDatatypeException.java:8)
	 */

}
