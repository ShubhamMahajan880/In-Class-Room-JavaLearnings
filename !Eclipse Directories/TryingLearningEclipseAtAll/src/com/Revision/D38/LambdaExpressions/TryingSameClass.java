package com.Revision.D38.LambdaExpressions;

interface Summing {
	public abstract int numberSum(int a, int b);
}

public class TryingSameClass {

	public static void main(String[] args) {
		Summing s = (i, j) -> i + j;

		System.out.println(s.numberSum(25, 10));

	}

}
