package Collection.Framework;

class Personaaa {
	String firstName;
	String lastName;

	public Personaaa(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class A2_0_TryingEquals {

	public static void main(String[] args) {
		Personaaa p1 = new Personaaa("shubh", "mahajan");
		Personaaa p2 = new Personaaa("shubh", "mahajan");

		System.out.println(p1.equals(p2)); // false - giving false while .equals compares content which is same, still its giving false,

		/*so it worked in string for here, we need to override equal method.
		  - Here object class equal method compares the References
		  - By default equal is not comparing the content, need to overrride the custom class - in case of string class it compares directly
		  - becuase developer has overriden the equal  methid in string class internally, no need to di it manually.
		 */



	}

}
