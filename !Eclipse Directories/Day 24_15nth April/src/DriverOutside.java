
public class DriverOutside {

	public static void main(String[] args) {
		Account aC = new Account();

		// when we didn't declare variable Private
		// aC.balance = 120000; // accessing using simple varible when private removed
		// System.out.println(aC.balance);

		aC.deposit(1200);
		System.out.println(aC.getBalance());

	}

}
