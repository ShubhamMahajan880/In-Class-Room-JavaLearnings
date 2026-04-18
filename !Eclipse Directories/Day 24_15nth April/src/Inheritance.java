
public class Inheritance {

	class AccountMgmt // Parent of Account Class
	{
		String ifscCode = "barb0khargo";

		public void doFundTransfer() {
			System.out.println("AccountMagmt.doFundTranser()...500 lines");

		}
	}

	class Account extends AccountMgmt {
		public void pay() {
			Account account = new Account();
			System.out.println(account.ifscCode);// re-using the parent class attributes in child class.
			account.doFundTransfer();// we are re-using parent class method

		}
	}

	public static void main(String[] args) {
		System.out.println("Inheritance Understanding - ");
		Inheritance iH = new Inheritance();
		Account a1 = iH.new Account();
		a1.pay();


	}

}

/*
 * Inheritance Understanding - barb0khargo AccountMagmt.doFundTranser()...500
 * lines
 */