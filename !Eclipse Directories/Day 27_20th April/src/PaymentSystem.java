	
class PaymentMethods { // super class of UPI
	void doPayment(String accnNo, int amount, String note) {
		System.out.println("PaymentSystems.doPayemnt().....");
	}
}

class UPI extends PaymentMethods {
	@Override // responsible for check all rules of Overriding - check al at time of
				// compilation

	protected void doPayment(String accnNo, int amount, String note) {
		System.out.println("UPI.doPayment");
	}
}

public class PaymentSystem {

}