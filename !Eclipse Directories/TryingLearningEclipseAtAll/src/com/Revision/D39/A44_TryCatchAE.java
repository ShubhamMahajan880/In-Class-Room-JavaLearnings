package com.Revision.D39;

public class A44_TryCatchAE {

	public static void main(String[] args) {

		System.out.println("A44_TryCatchAE.main() - START");

		int number = 55;


		try
		{
			int result = number/0;
		}
		catch (Exception e)
		{
			System.out.println("Operatin not possibel bro");
			e.printStackTrace();
		}
		System.out.println("A44_TryCatchAE.main() - END");
	}

	/*	A44_TryCatchAE.main() - START
		Operatin not possibel bro
		java.lang.ArithmeticException: / by zero
			at com.Revision.D39.A44_TryCatchAE.main(A44_TryCatchAE.java:14)
		A44_TryCatchAE.main() - END
	*/
}
