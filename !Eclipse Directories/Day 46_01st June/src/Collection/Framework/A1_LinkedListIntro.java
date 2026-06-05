package Collection.Framework;

import java.util.LinkedList;

public class A1_LinkedListIntro {

	public static void main(String[] args) {
		LinkedList<String> companyNames = new LinkedList<String>();

		companyNames.add("Adobe");
		companyNames.add("Service Now");
		companyNames.add("Intuit");
		companyNames.add("Optum");
		companyNames.add("Wallmart");

		System.out.println(companyNames);
		companyNames.add(3, "Stripe");
		System.out.println(companyNames);
	}

}
