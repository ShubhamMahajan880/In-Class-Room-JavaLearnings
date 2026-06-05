package Collection.Framework;

import java.util.HashSet;
import java.util.Set;

public class A1_UnderstandingHashCode {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<String>(16);
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bangalore");
		cities.add("Bangalore");
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Pune");

		System.out.println("Delhi".hashCode());//65915436
		System.out.println("Delhi".hashCode());//65915436 - same pointing address in memory as same word having same hashcode.

		System.out.println("delhi".hashCode());//95468108

		int hash = "Bangalore".hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = (16 - 1) & hash; // bitmap/ bitwise formula
		System.out.println("Bangalore stored at " + bucketIndex);

		System.out.println(cities);

	}

}

/*65915436
65915436
95468108
Bangalore stored at 15
[Delhi, Pune, Mumbai, Hyderabad, Bangalore]
 */
