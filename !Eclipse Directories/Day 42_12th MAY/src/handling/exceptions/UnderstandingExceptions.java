package handling.exceptions;

public class UnderstandingExceptions {

	public static void main(String[] args) {

		try {
			System.out.println("try START.....");
			String name = args[0];// This code may throw exception
			System.out.println("try END.....");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Name is not provided.. user didn;t give us the input");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some other problem...");
		}

	}

	/*
	 * When we didnt pass the value Exception in thread "main"
	 * java.lang.ArrayIndexOutOfBoundsException: 0 at
	 * custom.exceptions.Driver.main(Driver.java:7)
	 */

	/*
	 * when arguement passsesd and program terminated successfully. try START.....
	 * try END.....
	 */

	/* Understanding the flow in both the cases. */


}
