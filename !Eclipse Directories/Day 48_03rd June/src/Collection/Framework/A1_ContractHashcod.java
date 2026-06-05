package Collection.Framework;

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 145282;
	}

}

public class A1_ContractHashcod {

	public static void main(String[] args) {

		//Contract 1 - If two objects are equal then the hashcode must be same
		String s1 = "DSA";
		String s2 = "DSA";

		System.out.println(s1.hashCode() + " and " + s2.hashCode()); // 67986 and 67986 - both are same, as same object, so same hashCode

		//Contract 2 - If two objects return same hash code, then object may or may not be equal
		Person p1 = new Person("Shubh");
		Person p2 = new Person("Mahajan");

		System.out.println(p1.hashCode() + " and " + p2.hashCode() + " is p1 and p2 equal ? " + p1.equals(p2));
		/* 145282 and 145282is p1 and p2 equal ?false - p1 and p2 are not same still giving the same hash code, becuase we forced to it by overrding the hashcode.
		 * because we are here forcing to implement same hashCode for 2 different objects. WHich is contract 2*/

	}

}
