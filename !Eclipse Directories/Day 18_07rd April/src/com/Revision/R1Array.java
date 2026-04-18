package com.Revision;

class CompanyDetails {
	public void stringConcepts() {
		String companiesList[] = new String[6];

		companiesList[0] = "Paytm";
		companiesList[1] = "PhonePay";
		companiesList[2] = "PhonePay";
		companiesList[3] = "FamPay";
		companiesList[4] = "CRED";
		companiesList[5] = "ZET";

		for (int i = 0; i < companiesList.length; i++) {
			System.out.println(companiesList[i]);
		}

		for (int i = 0; i < companiesList.length; i++) {
			String newInfo = companiesList[i];
			if(newInfo.startsWith("P"))
			{
				System.out.println(newInfo);
			}

		}

	}
}

public class R1Array {

	public static void main(String[] args) {
		System.out.println("understanding String and its concepts ");

		CompanyDetails cD = new CompanyDetails();
		cD.stringConcepts();
	}

}
