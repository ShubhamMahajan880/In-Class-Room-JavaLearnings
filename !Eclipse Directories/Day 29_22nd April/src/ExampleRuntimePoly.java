class PaymentManagement {
	public void paymentMethod() {
		System.out.println("PaymentManagement.paymentMethod()");

	}
}

class InternationalPayment extends PaymentManagement

{
	@Override
	public void paymentMethod() {
		System.out.println("InternationalPayment.paymentMethod()");
	}
}

public class ExampleRuntimePoly {

	public static void main(String[] args) {

		// 1. Child → Child
		InternationalPayment ip = new InternationalPayment(); // child class refering to child class
		ip.paymentMethod(); // child class's method iteself

		// 2. Downcasting (CORRECT WAY)
		PaymentManagement pm3 = new InternationalPayment(); // upcasting
		InternationalPayment ip2 = (InternationalPayment) pm3; // downcasting
		ip2.paymentMethod();

		// 3. Parent → Parent
		PaymentManagement pm = new PaymentManagement(); // parent class referring to parent class itself
		pm.paymentMethod(); // accessing to parent class's method

		// 4. Parent → Child (Runtime Polymorphism)
		PaymentManagement pm2 = new InternationalPayment();// parent class referring to child class
		pm2.paymentMethod();// accessing to child class's method

	}

}
