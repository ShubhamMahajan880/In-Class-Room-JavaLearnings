package newfunctionality.Interface3;

interface EComSystem {
	void placeOrder(); // by default its public abstract void placeOrder();

	void cancelOrder();

	void editOrder();

	void generateInvoice();

	public static void printInvoicePDF() // common Utility functionality - those who want they can
	{
		// 200 lines of code
		System.out.println("I am responsible for printing all classes reciept and seller logo");
	}
}

class Amazon implements EComSystem {

	@Override
	public void placeOrder() {
		System.out.println("Amazon.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("Amazon.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("Amazon.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("Amazon.generateInvoice()");
		EComSystem.printInvoicePDF();

	}

	// private void printInvoicePDF() { // if i had to use like this then need to do
	// for all the child classes and code duplicasy, so to avoiding this we declared
	// static to method, by using which common utility functionality can be used again and again from static, not tocreate and wroter again the code. It avoids the code reusability
	// System.out.println("Amazon.printInvoicePDF()");
	// }
}

class Flipkart implements EComSystem {

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("Flipkart.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("Flipkart.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("Flipkart.generateInvoice()");
		EComSystem.printInvoicePDF();
	}

}

//public class LearningInterface3
//{
//
//}