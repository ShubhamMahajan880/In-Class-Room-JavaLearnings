package com.Revision.D41;

public class CheckedExceptionHandling {

	public static void main(String[] args) {
		String myInfo = "";
		System.out.println(myInfo.length());

		/*
		 * Exception in thread "main" java.lang.NullPointerException at
		 * com.Revision.D41.CheckedExceptionHandling.main(CheckedExceptionHandling.java:
		 * 7)
		 */

		try {
			Class.forName(myInfo5665);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
