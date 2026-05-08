package exceptionn.handling;

public class TryCacheUnderstanding {

	public static void main(String[] args) {
		System.out.println("Starting the program");
		String name = null;
		int amount = 200;
		System.out.println("Amount is - " + amount);

		try {
			System.out.println("Before Exception");
			System.out.println("length - " + name.length()); // inside try we put risky code which may throw exceptions.
			System.out.println("After Exception");// Skipped in case of NPE.

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is Null");// message which describe the error
		}

		System.out.println("Program Ended Successfully");
	}

//	Starting the program
//	Amount is - 200
//	Before Exception
//	java.lang.NullPointerException
//		at handling.exceptions.TryCacheUnderstanding.main(TryCacheUnderstanding.java:13)
//	Name is Null
//	Program Ended Successfully


}
