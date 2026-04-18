
class PaymentSystem {
	public void Pay() {
		System.out.println("I am doing Payment");

	}
}

class PhonePay extends PaymentSystem {
	public void Pay() {
		System.out.println("I am doing PhonePay Payment Method");
	}
}

class GooglePay extends PaymentSystem {
	public void Pay() {
		System.out.println("This timem, I am doing GooglePay Payment Method");
	}
}

public class ExampleMethdoOverRiding {
	public static void main(String[] args) {
		System.out.println("Printing Payment Methods Using OverRiding Concepts in Inheritance");
		GooglePay g = new GooglePay();
		g.Pay();

		PhonePay p = new PhonePay();
		p.Pay();

		PaymentSystem s = new PaymentSystem();
		s.Pay();
	}

}
