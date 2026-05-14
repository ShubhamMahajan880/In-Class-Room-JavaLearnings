package com.Revision.D39;

public class A2_IndexOutoFBondException {

	public static void main(String[] args) {

		String number = args[0];
		int newNumber = Integer.parseInt(number);

		System.out.println("Entered number is - "+newNumber);

	}

	/*when inpuit not given by user through cmmand line arguememnt
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at com.Revision.D39.A2_IndexOutoFBondException.main(A2_IndexOutoFBondException.java:7)
	*/

}
