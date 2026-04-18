
public class Invoice extends Notifications {
	public void generateInvoice() {
		System.out.println("Invouice.generateInvoice()");
		// Once the invoice is generated we need to send pdf over email or whats app or
		// text

		sendWhatsApp("Processed Completd", "Please find the invoice", "attachement Path", "Dowwnload Invoice");
		sendSMS("Billing Completed", "Amazon");
	}

}