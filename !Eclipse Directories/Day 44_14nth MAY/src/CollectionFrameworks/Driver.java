package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		//Task -> Create an array list and store the elements

		ArrayList<String> studentList = new ArrayList<String>(); // default capacity of array for storing objs is - 10

		studentList.add("Microsoft");// Added String Object to the list
		studentList.add("Google");
		studentList.add("Adobe");
		studentList.add("walmart");
		studentList.add("VISA");
		studentList.add("adobe");
		studentList.add("ServiceNow");
		studentList.add("Rippling");
		studentList.add("confluent");
		studentList.add("DataBricks");
		studentList.add("Confluent");

		/*
		ArrayList - is responsible for ordered and repeating. It allows duplicate objects to appear as well as in the correct order.
		Array is always index based.
		Doing some operations - find the names start with 'A'
		OR get lower case
		OR get Upper case
		 */

		System.out.println(studentList);
		System.out.println("------------>");

		for (int i = 0; i < studentList.size(); i++) {

			String firstElement = studentList.get(i);
			if (firstElement.startsWith("A")) {
				System.out.println(firstElement);
			}
		}
		System.out.println("------------>");

		for(int j = 0; j<studentList.size(); j++)
		{
			String secondElement = studentList.get(j);

		}
	}

}
