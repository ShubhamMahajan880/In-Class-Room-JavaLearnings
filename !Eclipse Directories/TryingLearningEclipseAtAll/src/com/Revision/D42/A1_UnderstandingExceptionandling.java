package com.Revision.D42;

public class A1_UnderstandingExceptionandling {

	public void doSomething() {
		System.out.println("A1_UnderstandingExceptionandling.doSomething() - START");
		String companyName = null;

		try {
			System.out.println("Lenght of the string is - " + companyName.length());
		} catch (NullPointerException e) {
			companyName = "amazon";
			System.out.println("Compny name not provided and no nay sense of providing inside catch block, is only catches the erorr and handle not allot in memeory");
			e.printStackTrace();
		}

		for(int i =0; i<5; i++)
		{
			System.out.println("Chekcing classes "+i);
		}
		System.out.println("A1_UnderstandingExceptionandling.doSomething() - END");

	}

	public static void main(String[] args) {
		System.out.println("MAIN METHOD - START");

	}

}
