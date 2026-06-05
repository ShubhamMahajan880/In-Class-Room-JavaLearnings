package com.Revision.D45;

import java.util.ArrayList;

public class ArrayListUnderstanding {

	public static void main(String[] args) {

		ArrayList<String> myEarnings = new ArrayList<String>();
		myEarnings.add("Job");
		myEarnings.add("Freelancing");
		myEarnings.add("Affiliate Income");
		myEarnings.add("Recurrence or Maintanance Income");
		myEarnings.add("Investement Returns");

		System.out.println(myEarnings);
		System.out.println("------------->");

		System.out.println(myEarnings.get(2));
		System.out.println("------------->");

		myEarnings.add(3, "Content Creation Income ");


		System.out.println(myEarnings);
		System.out.println("------------->");
	}

}
