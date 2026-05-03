package com.Revision.D26;

class PaymentGateway {
	public void paymentSystem() {
		System.out.println("PaymentGateway.paymentSystem()");
	}

}

class GooglePay extends PaymentGateway {
	public void paymentSystem() {
		System.out.println("GooglePay.paymentSystem()");

	}
}

class PhonePay extends PaymentGateway {
	public void paymentSystem() {
		System.out.println("PhonePay.paymentSystem()");
	}
}

class PayTM extends PaymentGateway {
	public void paymentSystem() {
		System.out.println("PayTM.paymentSystem()");
	}
}

public class NewPaymentGateways {

	public static void main(String[] args) {
		System.out.println("NewPaymentGateways.main()");
		System.out.println("Here are several types of Payment Gateways are available");

		PaymentGateway pG = new PaymentGateway();
		pG.paymentSystem();

		GooglePay gP = new GooglePay();
		gP.paymentSystem();

		PhonePay phP = new PhonePay();
		phP.paymentSystem();

		PayTM ptM = new PayTM();
		ptM.paymentSystem();
	}

}
