package in.mahajanDevelopers;

public class Payment {
	static int amount;
	static String balance;

	public static void main(String[] args) {
		amount = 1200;
		amount += 100;

		balance = args[0];
		int number = Integer.parseInt(balance);
		number += 200;

		System.out.println("Final amount is - " + amount);
		System.out.println("Balance is  - " + number);

	}

}
