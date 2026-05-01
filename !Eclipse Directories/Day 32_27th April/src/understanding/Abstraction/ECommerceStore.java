package understanding.Abstraction;

abstract class EcomDeliverySystem {
	public abstract void viewCart();

	public abstract void proceedToPayment();

	public void userLogin() { // Non- Abstract
		System.out.println("EcomDeliverySystem.userLogin()");
	}

	public void reviewsAndRatings() {
		System.out.println("EcomDeliverySystem.reviewsAndRatings");
	}

	EcomDeliverySystem() {
		super();
	}

}

class Amazon extends EcomDeliverySystem {
	@Override
	public void viewCart() {
		System.out.println("This is EcomDeliverySystem.viewCart()");
	}

	@Override
	public void proceedToPayment() {
		System.out.println("This one is for EcomDeliverySystem.proceedToPayment()");
	}

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		super.userLogin();
	}
}

class instaMart extends EcomDeliverySystem {
	@Override
	public void viewCart() {
		System.out.println("Again EcomDeliverySystem.viewCart()");
	}

	@Override
	public void proceedToPayment() {
		System.out.println("Again one for EcomDeliverySystem.proceedToPayment()");

	}
}

public class ECommerceStore {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.viewCart();
		a.proceedToPayment();

		instaMart iM = new instaMart();
		iM.viewCart();
		iM.proceedToPayment();

	}

}
