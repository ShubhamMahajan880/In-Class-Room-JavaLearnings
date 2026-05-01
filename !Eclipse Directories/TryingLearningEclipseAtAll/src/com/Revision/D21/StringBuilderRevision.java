package com.Revision.D21;

public class StringBuilderRevision {

	public static void main(String[] args) {
		String s1 = "Mahindra BE6";
		System.out.println(s1);

		s1.concat("In Electric Cars");
		System.out.println(); // concatenation not done as string is Immutable

		s1 = s1.concat("is best car");
		System.out.println(s1);// COncatnated successfully as by creating a new s1 object

//		s1.append("Must take it");// - not allowing for append
//		System.out.println(s1);

		StringBuilder sB = new StringBuilder("Mahindra BE6");
		sB.append("In Electric Cars");
		System.out.println(sB);

		StringBuffer sB2 = new StringBuffer("Tata Curv.EV");
		sB2.append("Is also the best one");
		System.out.println(sB2);
	}

}
