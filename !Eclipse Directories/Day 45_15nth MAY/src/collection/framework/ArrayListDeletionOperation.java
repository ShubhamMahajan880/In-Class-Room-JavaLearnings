package collection.framework;

import java.util.ArrayList;

public class ArrayListDeletionOperation {

	public static void main(String[] args) {
		ArrayList<String> companies = new ArrayList<String>(); // default capacity -> 10 obj, on addding new - it increase by 50%

		companies.add("ServiceNow");
		companies.add("Microsoft");
		companies.add("Walmart");
		companies.add("JP Morgan Chase");
		companies.add("Adobe");
		companies.add("Intuit");
		companies.add("Optum");

		//Accessng any random element
		System.out.println(companies.get(4));//Adobe

		//Printing all
		System.out.println(companies);//[ServiceNow, Microsoft, Walmart, JP Morgan Chase, Adobe, Intuit, Optum]

		companies.remove(2);
		System.out.println(companies);//[ServiceNow, Microsoft, JP Morgan Chase, Adobe, Intuit, Optum]


	}

}
