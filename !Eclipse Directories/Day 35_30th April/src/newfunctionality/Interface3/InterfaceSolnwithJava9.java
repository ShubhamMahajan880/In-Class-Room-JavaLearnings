package newfunctionality.Interface3;

interface EComSystem2 {
	void placeOrder(); // by default its public abstract void placeOrder();

	void cancelOrder();

	void editOrder();

	default void generateInvoice()
	{
		//sendSMS();
	}




//	public static void printInvoicePDF() // common Utility functionality - those who want they can
//	{
//		// 200 lines of code
//		//(Connect to Server (50 lines of code)--> init print --> write to file --> send to customer(25))
//
//	}
//
//	public static void sendNotification()
//	{
//		//(Connect to Server (50 lines of code) --> Draft Email --> send to Customer(25)
//	}
//
//	private static connectServer() // its not allowed with java 8 or 1.8, can;t declare private method inside interface's functionalities
//	{
//
//	}

	public static void printInvoicePDF()
	{
		connectServer();
		notifyCustomer();

	}

	public static void sendNotification()
	{
		connectServer();
		notifyCustomer();
	}

	private static void connectServer() // from java 1.9 or 9 we can declare private to the methods. So here veriosn changes to java 9 and declared private successfully.
	{
		System.out.println("EComSystem2.connectServer()");
	}

	private static void notifyCustomer() // from java 1.9 or 9 we can declare private to the methods. So here veriosn changes to java 9 and declared private successfully.
	{
		System.out.println("EComSystem2.notifyCustomer()");
	}

	private void sendSMS()
	{
		//50 lines
		System.out.println("EComSystem2.sendSMS() - Ordered delivered successfully, here's your invoice");
	}

}

class blinkit implements EComSystem2 {


	@Override
	public void placeOrder() {
		System.out.println("blinkit.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("blinkit.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("blinkit.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("blinkit.generateInvoice()");
		EComSystem.printInvoicePDF();

	}

	// private void printInvoicePDF() { // if i had to use like this then need to do
	// for all the child classes and code duplicasy, so to avoiding this we declared
	// static to method, by using which common utility functionality can be used again and again from static, not tocreate and wroter again the code. It avoids the code reusability
	// System.out.println("Amazon.printInvoicePDF()");
	// }
}

class InstaMart implements EComSystem {

	@Override
	public void placeOrder() {
		System.out.println("InstaMart.placeOrder()");

	}

	@Override
	public void cancelOrder() {
		System.out.println("InstaMart.cancelOrder()");

	}

	@Override
	public void editOrder() {
		System.out.println("InstaMart.editOrder()");

	}

	@Override
	public void generateInvoice() {
		System.out.println("InstaMart.generateInvoice()");
		EComSystem.printInvoicePDF();
	}

}



public class InterfaceSolnwithJava9 {

}
