package custom.exceptions.tryingQun;


public class AnotherDriver {

	public static void main(String[] args) {
		String contactNumber = args[0];

		CustomerRegistration cR = new CustomerRegistration();
		try {
			cR.regsiterCustomer(contactNumber);
		} catch (ContactAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println("Contact Number is already registered with us, please try with different one");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/*
	 * custom.exceptions.tryingQun.ContactAlreadyExistsException: Conatct no. -
	 * 9669999880 already registered Contact Number is already registered with us,
	 * please try with different one at
	 * custom.exceptions.tryingQun.CustomerRegistration.regsiterCustomer(
	 * CustomerRegistration.java:15) at
	 * custom.exceptions.tryingQun.AnotherDriver.main(AnotherDriver.java:11)
	 */
}
