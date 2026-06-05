package Collection.Framwork;

import java.util.HashSet;

public class A11_SimplePractices {

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
		set.add("-------"+null+"------------");
		set.add("-------"+null+"------------");

		//Task - Get the city name(s) which starts with 'A'
		// How do you read/ iterate the collection/ set

		for (String element : set) {

			System.out.println(element);

		}
		System.out.println("------------------>");

	}

}
