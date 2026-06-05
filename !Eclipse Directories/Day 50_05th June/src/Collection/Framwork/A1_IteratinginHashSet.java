package Collection.Framwork;

import java.util.HashSet;
import java.util.Iterator;

public class A1_IteratinginHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		//	Adding the Elements

		set.add("Bangalore"); // return type of add - here is always boolean
		set.add("Hyderabad");
		set.add("Pune");
		set.add("Gurugram");
		set.add("Noida");
		set.add("Delhi");
		set.add("Ahmedabad");
		set.add("Chennai");
		set.add("Amravati");

		//Task - Get the city name(s) which starts with 'A'

		// How do you read/ iterate the collection/ set

		for (String element : set) {
			if (element != null && element.startsWith("A")) // processing logic
			{
				System.out.println(element);
			}
		}
		System.out.println("------------------>");

		//Using Iterator

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) // check if next element is there or not
		{
			String element = itr.next();// read the element
			if (element != null && element.startsWith("A"))// processing logic
			{
				System.out.println("Cities start with A are - ................:" + element);
			}
		}

	}

}
