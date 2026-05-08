package com.Revision.D38.LambdaExpressions;

interface SummationWork {
	public abstract int sankhyaYog(int c, int d);
}

public class AgainTry {

	public static void main(String[] args) {

		System.out.println("AgainTry.main()");

		SummationWork sW = (i, j) -> i + j;
		System.out.println(sW.sankhyaYog(15, 10));

	}

}
