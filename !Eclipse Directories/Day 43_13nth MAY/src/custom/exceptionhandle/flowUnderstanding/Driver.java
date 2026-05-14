package custom.exceptionhandle.flowUnderstanding;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");

		User user = new User();

		try {
			user.createUser();
		} catch (UserCreatedException e) {
			e.printStackTrace();
			System.out.println(
					"Sorry,  we are unable to create user. Pls contact suppport team on the conntact - 99999999");

		}
		System.out.println("Driver.main() - END");

	}

}

class Account {
	public void createAccount() throws FailedToCreateAccountException {
		System.out.println("Account.createAccount() - START");
		if (true) {
			throw new FailedToCreateAccountException("Unable to create ths accoun");
		}
		System.out.println("Account.createAccount() - END");
	}
}

class User {
	public void createUser() {
		System.out.println("User.createUser() - START");
		Account account = new Account();
		try {
			account.createAccount();
		} catch (FailedToCreateAccountException e) {
			e.printStackTrace();
			throw new UserCreatedException("Not able to create");
		}

		System.out.println("User.createUser() - END");

	}
}