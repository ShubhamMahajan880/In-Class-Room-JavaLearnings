package com.Revision.D38.LambdaExpressions;


public class DriverLogic {

	public static void main(String[] args) {
		IAdditionProgram iA = (i,j) -> i+j;

		int sum = iA.numberAddition(15, 10);
		System.out.println(sum);


	}

}
