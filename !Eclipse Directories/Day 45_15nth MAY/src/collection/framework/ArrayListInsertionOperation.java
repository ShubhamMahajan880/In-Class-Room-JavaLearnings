package collection.framework;

import java.util.ArrayList;

public class ArrayListInsertionOperation {

	public static void main(String[] args) {

		ArrayList<String> companies = new ArrayList<String>(); // default capacity -> 10 obj, on addding new - it increase by 50%

		companies.add("ServiceNow");
		companies.add("Microsoft");
		companies.add("Walmart");
		companies.add("Adobe");
		companies.add("Intuit");
		companies.add("Optum");

		//Accessng any random element
		System.out.println(companies.get(4));//Intuit

//		Printing all
		System.out.println(companies);//[ServiceNow, Microsoft, Walmart, Adobe, Intuit, Optum]

		companies.add(2, "Google");
		System.out.println(companies); //[ServiceNow, Microsoft, Google, Walmart, Adobe, Intuit, Optum]

	}

}
