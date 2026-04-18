
public class Account {

	private int balance = 1000;// Data , if private removed then not encapsulated

	// Setter
	public void deposit(int _amount) {
		if (_amount > 0) {
			balance = balance + _amount;
		} else {
			System.err.println(" Invalid Amount");
		}
	}

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
