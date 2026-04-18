package in.mahajanDevelopers;

public class AnothrClassTryingAccess {

	public static void main(String[] args) {
		System.out.println("This is main method of another class .. which will try");

		AccessModifiers a = new AccessModifiers();
		a.tryingToAccess();

		//AnothrClassTryingAccess a1 = new AnothrClassTryingAccess();


		System.out.println("After making tryingToAccess() method public its accessible by annother file within same package");


	}

}
