package understanding.Abstraction;

abstract class PaymentSystem2 { // (Abstract) + (Non-Abstract - Method with body)
	public abstract void pay();// what ?

	public abstract void doKYC(); // if we are using abstract means we are forcing to implement. If method name is
									// declared with abstract and class ia also abstract then. in the

	public void StopCheque() { // Non-Abstract - Method with body
		System.out.println("PaymentSystem2.StopCheque()");
	}

	PaymentSystem2() { // constuctor of abstract class
		super();
	}
}

class HDFC2 extends PaymentSystem2 {
	@Override
	public void pay() {
		System.out.println("HDFC.Pay()");// How ? - decided by implementing classes`
	}

	@Override
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
	}

	HDFC2() {
		super();// default constructor and first line is super with no args
	}
}

public class AbstractionConstructor {

	public static void main(String[] args) {

//		PaymentSystem2 pS2 = new PaymentSystem2(); // can;t create the object of Abstract class becuase class itself is INCOMPLETE
		HDFC2 hDFC = new HDFC2(); // abstract class can have constrcutor as child class's object can be created.
		hDFC.pay();
		hDFC.doKYC();

	}

}
