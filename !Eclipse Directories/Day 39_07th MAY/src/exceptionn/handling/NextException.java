package exceptionn.handling;

public class NextException {

	public static void main(String[] args) {
		System.out.println("Starting the Program");

		String placeName = args[0];
		int maxCrossRoads = 20;


		System.out.println("Numbers alloted for cross roads are - " + maxCrossRoads);
		System.out.println("Name of the place is - " + placeName.length());

		System.out.println("Ending the Program");

		// Exception - 2) - Argument not Passed/Invalid Index
		// Starting the Program
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		// at handling.exceptions.NextException.main(NextException.java:8)

	}

}
