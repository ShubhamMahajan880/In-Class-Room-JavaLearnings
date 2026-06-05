package Collection.Framwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class A2_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		//	Adding the Elements

		set.add("Bangalore");
		set.add("Hyderabad");
		set.add("Pune");
		set.add("Gurugram");
		set.add("Noida");
		set.add("Noida");
		set.add("Delhi");
		set.add("Ahmedabad");
		set.add("Chennai");
		set.add("Amravati");
		set.add(null);
		set.add(null); // here even i am adding multiple null but its only allowing to single null.

		for (String element : set) {

			System.out.println(element);

		}
		System.out.println("------------------>");

	}
	/*
	Bangalore
	Hyderabad
	Pune
	Gurugram
	Noida
	Delhi
	Ahmedabad
	Chennai
	Amravati
	null
	------------------>
	*/

}
