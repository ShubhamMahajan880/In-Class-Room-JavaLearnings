package Collection.Framwork;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
}

public class A4_UnderstandingTreeSet {

	public static void main(String[] args) {

		TreeSet<Person> ps = new TreeSet<Person>();
		Person p1 = new Person("Shubam");
		Person p2 = new Person("Suraj");
		Person p3 = new Person("Ronak");

		ps.add(p1);
		ps.add(p2);
		ps.add(p3);

		System.out.println(ps);

	}

}
