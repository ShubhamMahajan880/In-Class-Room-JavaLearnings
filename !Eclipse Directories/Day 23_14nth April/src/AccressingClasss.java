
public class AccressingClasss {

	public static void main(String[] args) {
		understandingGettersSetters account = new understandingGettersSetters();
		// account.balance = 10000; - using this type of attribute we can't control if using getters & SETTERS
		account.setBalance(10000);
		System.out.println(account.getBalance()); // 100000

	}

}
