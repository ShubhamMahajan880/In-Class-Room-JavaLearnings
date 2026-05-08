package com.Revision.D38.LambdaExpressions;

interface LowerToUpper
{
	public abstract String textToBeConvert(String text);
}


interface UpperToLower
{
	public abstract String textToBeConvert2(String text);
}

public class CaseofStringConversionUsingLambdaExpression {

	public static void main(String[] args) {
		System.out.println("LowerStringConversionUsingLambdaExpression.main()");

		LowerToUpper lU = (formalityvariable) -> formalityvariable.toUpperCase();
		System.out.println(lU.textToBeConvert("Kodewala Academy")); // KODEWALA ACADEMY

		UpperToLower uL = (performingDatatypeFormality) -> performingDatatypeFormality.toLowerCase();
		System.out.println(uL.textToBeConvert2("Kodewala Academy")); //kodewala academy
	}

}
