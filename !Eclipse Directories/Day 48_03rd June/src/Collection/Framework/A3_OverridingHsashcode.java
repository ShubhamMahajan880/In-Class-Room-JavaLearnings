package Collection.Framework;

class Personal {
	String firstName;
	String lastName;

	public Personal(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj2) {
		Personal p2 = (Personal) obj2;
		return this.firstName.equals(p2.firstName) & this.lastName.equals(p2.lastName);
	}

	@Override
	public int hashCode() {

		return this.firstName.hashCode() + this.lastName.hashCode();
	}
}

public class A3_OverridingHsashcode {

	public static void main(String[] args) {
		Personal p1 = new Personal("shubh", "mahajan");
		Personal p2 = new Personal("shubh", "mahajan");

		System.out.println(p1.equals(p2));//true - Hashcode Overriding.

		System.out.println("p1 hashcode is - "+p1.hashCode() + " and " + "p2 hashcode is - "+ p2.hashCode()); // p1 hashcode is - 939140720 and p2 hashcode is - 939140720

		// So here by overrdign hascode - if objects are same then hashcodes are samee, if objects are differetn then hashcodes are also different

		/*Explanation
		 - Here object class equal method compares the References
		 - By default equal is not comparing the content, need to overrride the custom class - in case of string class it compares directly
		 - becuase developer has overriden the equal  methid in string class internally, no need to do it manually.
		 - - so for here maintaining the contract we are overridng equals method and setting the same return .
		 - But it creatd anther problem in hashcode - objects ar same but hashcode are different ?? and as per the 1st rule wheneeve - if same objects then same hashcode.. tis not following here
		 - so whenever, overrridng the equal method - must mantain the contract, so for it need to override the Hashcode also otherwiise contract will break
		*/
	}

}
