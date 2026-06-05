package Collection.Framework;

class Persona {
	String firstName;
	String lastName;

	public Persona(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj2) { // object class is parent class of all classes, here using downcasting trying accessing parent class(which is object) by child class(which is persona)
		Persona p2 = (Persona) obj2;
		return this.firstName.equals(p2.firstName) & this.lastName.equals(p2.lastName);
	}

}

public class A2_OverrideEqualmMethod {

	public static void main(String[] args) {
		Persona p1 = new Persona("shubh", "mahajan");
		Persona p2 = new Persona("shubh", "mahajan");

		System.out.println(p1.equals(p2));//true -

		/*- Here object class equal method compares the References
		  - By default equal is not comparing the content, need to overrride the custom class - in case of string class it compares directly
		  - becuase developer has overriden the equal  methid in string class internally, no need to di it manually.
		  - so for here maintaining the contract we are overridng equals method and setting the same return .
		  - - But it creatd anther problem in hashcode - objects ar same but hashcode are different ?? and as per the 1st rule wheneeve - if same objects then same hashcode.. tis not following here

		 */

		System.out.println("p1 hashcode is - "+p1.hashCode() + " and " + "p2 hashcode is - "+ p2.hashCode()); // p1 hashcode is - 366712642 and p1 hashcode is - 1829164700
		// hashcode had to be simialr as both are same objects. but not following the contreact here, we need to override the hashcode method also here

		/*My Wake up Calls -
		 Using constructor as passing arguements.
		 using downcasting becuase child class can access parent class(which is object class).
		 Overrding and returniong booleasn.
		  */

	}

}
