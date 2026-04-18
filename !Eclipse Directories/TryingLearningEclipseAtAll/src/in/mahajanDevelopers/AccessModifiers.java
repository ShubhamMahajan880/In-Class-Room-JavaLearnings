package in.mahajanDevelopers;

public class AccessModifiers {

	public static void main(String[] args) {
		System.out.println("1 - Forever main class ");

		System.out.println("2 - Intializing object creation for accessing next public/private method ...");
		AccessModifiers a = new AccessModifiers();
		a.tryingToAccess();
		System.out.println("4 - So when  next metho is private in the same class accessed Successfully");


	}

	void tryingToAccess() {
		System.out.println("3 - I am tryig to accessing this when its public/private - Same Package & Default Package");

	}

}
