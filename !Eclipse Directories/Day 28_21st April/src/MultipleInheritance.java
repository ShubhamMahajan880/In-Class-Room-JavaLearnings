
class Accounts {
	public void openAccount(String accountDetails) {
		System.out.println("Accounts.openAccount()");

	}
}

class SavingAccount extends Accounts {
	public void openAccount(String accountDetails) {
		System.out.println("Accounts.SavingAccounts.openAccount()");

	}
}

class CurrentAccount extends Accounts {
	public void openAccount(String accountDetails) {
		System.out.println("Accounts.CurrentAccounts.openAccount()");

	}
}

class HybridAccount extends CurrentAccount, SavingAccount // Not allowed Multi Level Inheritance
{

}

class MixedAccount extends SavingAccount // clearly allowed as only one parent can exist.
{

}

class MixedAccount2 extends CurrentAccount // it's also clearly allowed .. either one can be extend not both. One parent can be possible.
{

}

public class MultipleInheritance {

}
