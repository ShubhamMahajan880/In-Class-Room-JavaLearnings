package Marker.Interface;

class Account implements DataPrintable{
	String accountHolderName;
	int accountBalance;
	String accountType;
	int atmPin;

	public Account(String _accountHolderName, int _accountBalance, String _accountType, int _atmPin) {
		this.accountBalance = _accountBalance;
		this.accountHolderName = _accountHolderName;
		this.accountType = _accountType;
		this.atmPin = _atmPin;


	}
}

class DataProcessor {
	public void printingDetails(Object obj) {
		if (obj instanceof DataPrintable) // it will be only true if account class implements dataprintable.. agr access
											// h to hi acocunt ki ifnormaiton show krega itherwise nhi
		{
			Account aC = (Account) obj;
			System.out.println("Account Holder Name  - " + aC.accountHolderName);
			System.out.println("Account Balance is - " + aC.accountBalance);
			System.out.println("Account Type is - " + aC.accountType);
			System.out.println("ATM pin is - " + aC.atmPin);
		} else {
			System.err.println("No DataPrintable, don;t havce access to the sensitive account info");
		}

	}
}

public class AccountInformations {

	public static void main(String[] args) {
		System.out.println("AccountInformations.main()");
		Account aC2 = new Account("Shubham Mahjan", 11111111, "Curret Account", 1111);
		DataProcessor dP = new DataProcessor();
		dP.printingDetails(aC2);

	}

}
