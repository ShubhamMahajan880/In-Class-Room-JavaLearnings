package com.Revision.D38.LambdaExpressions;

interface Calculator {
	public abstract int OperationMethod(int c, int d);
}

public class CalculatorFunctions {

	public static void main(String[] args) {
		System.out.println("CalculatorFunctions.main()");

		Calculator c = (i, j) -> i + j;
		System.out.println("Addition is - " + c.OperationMethod(10, 5));

		Calculator c1 = (i, j) -> i - j;
		System.out.println("Substraction is - " + c1.OperationMethod(10, 5));

		Calculator c2 = (i, j) -> i * j;
		System.out.println("Multiplication is - " + c2.OperationMethod(10, 5));

		Calculator c3 = (i, j) -> i / j;
		System.out.println("Devision is - " + c3.OperationMethod(10, 5));

		Calculator c4 = (i, j) -> i % j;
		System.out.println("Modulus is - " + c4.OperationMethod(10, 5));

	}

}
