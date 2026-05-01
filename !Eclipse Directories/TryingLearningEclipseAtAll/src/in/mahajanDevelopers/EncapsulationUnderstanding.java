package in.mahajanDevelopers;


public class EncapsulationUnderstanding {
	public static void main(String[] args) {
		GettersSetters gS = new GettersSetters();
		// gS.s1 = "NewUpdatedString";
		// System.out.println(gS.s1);
		gS.setStringMethod("Trying new keyboards is my new string");

		System.out.println("I am printing the newly created string");
		gS.getStringMethod();

		gS.setStringMethod("This is enapsulation revision");

		gS.getStringMethod();
	}
}
