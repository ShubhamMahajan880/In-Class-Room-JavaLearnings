package exceptionn.handling;

public class FourthException {

	public static void main(String[] args) {

		System.out.println("Program Started");
		String amountString = args[0];
		int amount = Integer.parseInt(amountString);

		int result = amount/0 ;

		System.out.println("Result is - "+result);

		System.out.println("Program Ended");

	}

//	Exception - 4) - ArithmatiicExpressionError - when deviding by zero
//	Program Started
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at handling.exceptions.FourthException.main(FourthException.java:11)


}
