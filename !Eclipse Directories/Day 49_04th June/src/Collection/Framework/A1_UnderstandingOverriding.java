package Collection.Framework;

import java.util.HashSet;
import java.util.Set;

class Employee {
	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name);

	}

	public int hashCode() {
		return this.name.hashCode();
	}

}

public class A1_UnderstandingOverriding {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>();

		cities.add("BLR");
		cities.add("CHE");
		cities.add("BLR");

		System.out.println(cities);//[CHE, BLR] - becuase hashcode removes duplicacy and put unique elements
		System.out.println(cities.size());//2 - becuase only 2 uniqu objects added, as hashset.

		Set<Employee> emps = new HashSet<Employee>();
		Employee e1 = new Employee("ChatGPT");
		Employee e2 = new Employee("Gemini");
		Employee e3 = new Employee("Claude");
		Employee e4 = new Employee("ChatGPT");

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

		// in cities hashet,there is uniqueness, but in emps hashet no uniques, allowed duplicates - hashset failes ?? So, when there is class and adding creating objects even duplicate - hashset adding as a new object and allowng duplicate object - which is breaking contract. So need to override equal and hashset.

		// when hashcode not overridden -
		System.out.println(emps.size()); // 4 - becuase, Hashcode didnt override. Duplicate didnt remove, equal adds duplicates in same bucket.
		System.out.println(e1.hashCode() + " and " + e4.hashCode() + " and e1 & e4 are same - ?" + e1.equals(e4));//366712642 and 1311053135 - same obj but 2 different hashcodes, as stored in different buckets

		//when hashcode overriden
		System.out.println(emps.size());//3
		System.out.println(e1.hashCode() + " and " + e4.hashCode() + " and e1 & e4 are same - ?" + e1.equals(e4));//-1891223021 and -1891223021 - true



		/*Understanding
		 Case 1 - When No Equal Method Overridden, No Hashcode Overridden

		 System.out.println(emps.size()); //4
		 System.out.println(e1.hashCode() + " and " + e4.hashCode()+ " and e1 & e4 are same - ?" + e1.equals(e4) );// 580024961 and 1642360923 and e1 & e4 are same - ?false

		 -------
		 Case 2 - When Equal Method Overridden, No Hashcode Overridden

		 System.out.println(emps.size()); // 4
		 System.out.println(e1.hashCode() + " and " + e4.hashCode()+ " and e1 & e4 are same - ?" + e1.equals(e4) ); // 580024961 and 1642360923 and e1 & e4 are same - ?true

		  ---------
		 Case 3 - When No Equal Method Overridden, BUT  Hashcode Overridden

		 System.out.println(emps.size()); - 4
		 System.out.println(e1.hashCode() + " and " + e4.hashCode()+ " and e1 & e4 are same - ?" + e1.equals(e4) ); // // -1891223021 and -1891223021 and e1 & e4 are same - ?false

		 ----------
		 Case 4 - When Equal Method & Hashcode BOTH Overridden,

		 System.out.println(emps.size()); // 3
		 System.out.println(e1.hashCode() + " and " + e4.hashCode()+ " and e1 & e4 are same - ?" + e1.equals(e4) ); // -1891223021 and -1891223021 and e1 & e4 are same - ?true
		 */
	}

}
