package exceptionn.handling;

public class TryingExceptionsInJava {

	public static void main(String[] args) {

		System.out.println("Starting the Program");

		String placeName = null;
		int maxCrossRoads = 20;

		System.out.println("Numbers alloted for cross roads are - " + maxCrossRoads);
		System.out.println("Name of the place is - " + placeName);
		System.out.println("Length of entered string is - "+placeName.length());

		System.out.println("Ending the Program");

	}

//	Excpetion - 1) (NullPointerException)- variable is null, problem started from line number 14
//	Starting the Program
//	Numbers alloted for cross roads are - 20
//	Name of the place is - null
//	Exception in thread "main" java.lang.NullPointerException
//		at handling.exceptions.TryingExceptionsInJava.main(TryingExceptionsInJava.java:14)


}
