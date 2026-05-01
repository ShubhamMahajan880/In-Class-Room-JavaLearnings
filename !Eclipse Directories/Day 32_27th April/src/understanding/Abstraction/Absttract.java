package understanding.Abstraction;

// Abstract class can have both  - (Abstract) + (Non-Abstract - Method with body). Till now we used Concrete Methods to define the What & How both. Means What & How combined together. (Method & Method Body)

abstract class PaymentSystem { // (Abstract) + (Non-Abstract - Method with body)
	public abstract void pay();// what ?

	public abstract void doKYC(); // if we are using abstract means we are forcing to implement.

	public void StopCheque() { // Non-Abstract - Method with body
		System.out.println("PaymentSystem.StopCheque()");

	}
}

class HDFC extends PaymentSystem {
	@Override
	public void pay() {
		System.out.println("HDFC.Pay()");// How ? - decided by implementing classes`
	}

	@Override
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
	}
}

public class Absttract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
