
class LoginService {
	public void doLogin(String mobile, int otp) { // same Method Name + (Order of Args or Type of Args or No. of Args)
		System.out.println("LoginService.doLogin(String Mobile, int otp)");
	}

	public void doLogin(String mobile, int otp, long aadharNumber) {
		System.out.println("LoginService.doLogin(String Mobile, int otp, int aadharNumber)");
	}

	public void doLogin(int otp, String mobileNumber) {
		System.out.println("LoginService.doLogin(int otp, String mobileNumber)");
	}

	public void doLogin(String pan, String passPort) {
		System.out.println("LoginService.doLogin(String pan, String passPort)");

	}

}

public class MethodOverloading {

	public static void main(String[] args) {
		LoginService ls = new LoginService();
		ls.doLogin("9669999880", 1111, 111122	);
		/*
		 * ls.doLogin("9669999880", 1111); ls.doLogin(1111, "9669999880");
		 * ls.doLogin("Gwnpm89456K", "1232568989897");
		 *
		 * One login at a time exists and can be done.
		 */

	}

}
