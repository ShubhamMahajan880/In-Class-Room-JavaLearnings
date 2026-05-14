package com.Revision.D39;

public class A4_ArithmeticException {

	public static void main(String[] args) {
		int number = 45;

		int result = number/0;

		System.out.println("Result after illegaal devision is - "+result);

	}

	/*Java Artihmatic Excdption Error -
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.Revision.D39.A4_ArithmaticExpression.main(A4_ArithmaticExpression.java:8)
	*/
}
