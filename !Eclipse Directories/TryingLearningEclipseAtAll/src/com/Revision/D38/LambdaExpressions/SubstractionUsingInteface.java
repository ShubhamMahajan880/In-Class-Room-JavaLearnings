package com.Revision.D38.LambdaExpressions;

interface DifferenceWork {
	public abstract int minusOperation(int x, int y);
}

public class SubstractionUsingInteface {

	public static void main(String[] args) {
		System.out.println("SubstractionUsingInteface.main()");

		DifferenceWork dW = (i, j) -> i - j;
		System.out.println(dW.minusOperation(100, 50));
	}

}
