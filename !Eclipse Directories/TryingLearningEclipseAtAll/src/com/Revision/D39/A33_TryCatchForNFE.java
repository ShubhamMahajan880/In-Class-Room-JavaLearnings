package com.Revision.D39;

public class A33_TryCatchForNFE {

	public static void main(String[] args) {

		System.out.println("A33_TryCatchForNFE.main() - START");
		System.out.println("So, the salary is - ");

		try {
			String salaryInfo = args[0];
			int newSalary = Integer.parseInt(salaryInfo);
		}

		catch (Exception e) {
			System.out.println("Salalry is in terms of statemenet ????");
			e.printStackTrace();
		}
		System.out.println("A33_TryCatchForNFE.main() - END");

	}

	/*	when evevbrything is done correctlyy - enetred correct datatype
		A33_TryCatchForNFE.main() - START
		So, the salary is -
		A33_TryCatchForNFE.main() - END
	 */

	/*	when input in terms of different types -
		A33_TryCatchForNFE.main() - START
		So, the salary is -
		Salalry is in terms of statemenet ????
		java.lang.NumberFormatException: For input string: "FifteeenThousands"
			at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
			at java.lang.Integer.parseInt(Integer.java:580)
			at java.lang.Integer.parseInt(Integer.java:615)
			at com.Revision.D39.A33_TryCatchForNFE.main(A33_TryCatchForNFE.java:12)
		A33_TryCatchForNFE.main() - END
	 */

}
