package exceptionn.handling;

public class ThirdExceptionExploring {
	public static void main(String[] args) {

		System.out.println("Starting the Program");

		String amountStr = args[0];
		int amount = Integer.parseInt(amountStr);

		String name = args[1];
		System.out.println("Amount is - " + amount);
		System.out.println("Length is - " + name.length());

		System.out.println("Ending the Program");
	}

//	Exception - 3) - NumberFormatException - wrong datatype input
//	Starting the Program
//	Exception in thread "main" java.lang.NumberFormatException: For input string: "SHubam"
//		at java.lang.NumberFormatException.forInputString(Unknown Source)
//		at java.lang.Integer.parseInt(Unknown Source)
//		at java.lang.Integer.parseInt(Unknown Source)
//		at handling.exceptions.ThirdExceptionExploring.main(ThirdExceptionExploring.java:9)
//	Here theorder should be first int then string .. but as we gace input in different order, so error of wrong datatypea

}
