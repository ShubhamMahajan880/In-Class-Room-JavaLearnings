package com.Revision.D39;

public class A22_TryCacheForIOBE {

	public static void main(String[] args) {

		System.out.println("A22_TryCacheForIOBE.main() - START");


		try {
			String info = args[0];
			System.out.println("So the entered string is - " + info); // putitng rrisky code(which may throw the error) inside the try
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Input nothing entered");
			e.printStackTrace();
		}

		System.out.println("A22_TryCacheForIOBE.main() - END");
	}

	/*	A22_TryCacheForIOBE.main() - START
		Input nothing entered
		java.lang.ArrayIndexOutOfBoundsException: 0
			at com.Revision.D39.A22_TryCacheForIOBE.main(A22_TryCacheForIOBE.java:11)
		A22_TryCacheForIOBE.main() - END
	*/

}
