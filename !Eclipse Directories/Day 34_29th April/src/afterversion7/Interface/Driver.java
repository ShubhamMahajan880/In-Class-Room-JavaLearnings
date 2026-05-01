package afterversion7.Interface;

//2010(1.6) --> 2012(Wanter New Feature 'printPassBook')
interface IBanking {
	void pay();

	void settle();

	void cancelTxn();

	default void printPassBook() { // default Method type,and the access modifier is public.
		System.out.println("IBanking.printPassBook() - Default Functionality");
	}
}

class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");

	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");

	}

	@Override
	public void cancelTxn() {
		System.out.println("HDFC.cancelTxn()");

	}

}

class PNB implements IBanking {

	@Override
	public void pay() {
		System.out.println("PNB.pay()");

	}

	@Override
	public void settle() {
		System.out.println("PNB.settle()");

	}

	@Override
	public void cancelTxn() {
		System.out.println("PNB.cancelTxn()");

	}

}

class SBI implements IBanking {

	@Override
	public void pay() {
		System.out.println("SBI.pay()");

	}

	@Override
	public void settle() {
		System.out.println("SBI.settle()");

	}

	@Override
	public void cancelTxn() {
		System.out.println("SBI.cancelTxn()");

	}

	@Override
	public void printPassBook() {
		System.out.println("SBI.printPassBook()");
	}

}

public class Driver {
	public static void main(String[] args) {
		HDFC hD = new HDFC();
		hD.pay();
		hD.settle();
		hD.cancelTxn();
		hD.printPassBook();//Printing default waala msg


		SBI sB = new SBI();
		sB.pay();
		sB.settle();
		sB.cancelTxn();
		sB.printPassBook(); // Printing implemented function

	}
}
