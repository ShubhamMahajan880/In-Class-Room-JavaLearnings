package newfunctionality.Interface3;

interface EComSystem2 {
	void placeOrder(); // by default its public abstract void placeOrder();

	void cancelOrder();

	void editOrder();

	void generateInvoice();

	public static void printInvoicePDF() // common Utility functionality - those who want they can
	{
		// 200 lines of code
		//(Connect to Server (50 lines of code)--> init print --> write to file --> send to customer(25))

	}

	public static void sendNotification()
	{
		//(Connect to Server (50 lines of code) --> Draft Email --> send to Customer(25)
	}

	private static connectServer() // its not allowed with java 8 or 1.8, can;t declare private method inside interface's functionalities
	{

	}
}

class Myntra implements EComSystem2 {


	@Override
	public void placeOrder() {
		System.out.println("Myntra.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("Myntra.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("Myntra.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("Myntra.generateInvoice()");
		EComSystem.printInvoicePDF();

	}

	// private void printInvoicePDF() { // if i had to use like this then need to do
	// for all the child classes and code duplicasy, so to avoiding this we declared
	// static to method, by using which common utility functionality can be used again and again from static, not tocreate and wroter again the code. It avoids the code reusability
	// System.out.println("Amazon.printInvoicePDF()");
	// }
}

class shopsy implements EComSystem {

	@Override
	public void placeOrder() {
		System.out.println("shopsy.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("shopsy.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("shopsy.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("shopsy.generateInvoice()");
		EComSystem.printInvoicePDF();
	}

}


public class IssuesinInterfaceJV8 {

}
