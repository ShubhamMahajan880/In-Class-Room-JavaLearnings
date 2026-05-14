package com.Revision.D39;

public class A1_NullPointerException {

	public static void main(String[] args) {
		String information = null;
		System.out.println("Information's lneght is - " + information.length()); // NullPointerException

	}

	/* When string is initialized as NULL
	Exception in thread "main" java.lang.NullPointerException
	at com.Revision.D39.PractisingTry.main(PractisingTry.java:7) */

}
