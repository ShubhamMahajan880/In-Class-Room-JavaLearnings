
public class PaymentSystem2 {
	GenericResponse doPayment2(String accnNo, int amount, String note) {
		System.out.println("PaymentSystems.doPayemnt().....");
		return new GenericResponse("Default Payment");
	}
}

class UPI2 extends PaymentSystem2 {
	@Override // responsible for check all rules of Overriding - check al at time of compilation

	protected UPIResponse doPayment2(String accnNo, int amount, String note) {
		System.out.println("UPI.doPayment");
		return new UPIResponse("Default Payments", "200");
	}
}
