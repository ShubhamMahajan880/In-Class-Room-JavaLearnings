package Collection.Framwork;

import java.util.TreeSet;

public class A3_TreeSetUnderstanding {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>(); // Not on hashing based No role of equals and hashcode methods)

		ts.add("Bangalore");
		ts.add("Ahmedabad");
		ts.add("Hyderabad");
		ts.add("Chennai");
		ts.add("Delhi");
		ts.add("Noida");
		ts.add("Ahmedabad");
		//ts.add(null); - not even a single null is allowed here.

		System.out.println(ts);
		//[Ahmedabad, Bangalore, Chennai, Delhi, Hyderabad, Noida] - sorting and removing duplicates

	}

}
