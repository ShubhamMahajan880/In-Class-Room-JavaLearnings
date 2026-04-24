
public class RealWorldExamplePaymentGateway {
	public static void main(String[] args) {

		PaymentProcessor processor = new PaymentProcessor(); // PaymentProcessor class ka object yaha banaya h Universal
																// Main class me

		// any caller who will call our payment system will come here -

		UPIPayment upiPayment = new UPIPayment();
		processor.processPayment(upiPayment); // UPIPayment.doPayment() // PaymentProcessor class ka object access kr
												// rha h PaymentProcessor class ke method ko for calling any payment
												// method(UPIPayment) used by user here

		CardPayment cardPayment = new CardPayment();
		processor.processPayment(cardPayment);// CardPayment.doPayment()// PaymentProcessor class ka object access kr
												// rha h PaymentProcessor class ke method ko for calling any payment
												// method(CardPayment) used by user here

//		let say i added a new payment method - phonePay, then no need to change the functionality just need to add the class, write the funcitonality using created method and access from here

		RazoPay razoPayPaymentMethod = new RazoPay();
		processor.processPayment(razoPayPaymentMethod); // RazoPay.doPayment() - a newly payment method added recently(which will be child method, if working functionality already exists) and integrated in system(by using extends Payment class which is parent class) and accessing using paymentProcessing class's object processor

	}
}
