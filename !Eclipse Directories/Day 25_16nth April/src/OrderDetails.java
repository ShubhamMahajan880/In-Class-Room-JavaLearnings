
public class OrderDetails extends Notifications {

	public void orderRequest(String whatsAppMsg, String text, String attachement, String additionalInfo) { // Notification is a parent classs
																					// for OrderDetails Class
		System.out.println("Order.orderRequest()");

		// Once Order Placed, System/Platform need to send an update over emails/sms

		whatsAppMsg = "Request Recieved";
		text ="Your Order Placed Successfully";
		attachement = "Will Deliver in next 5 mins, Track Location";
		additionalInfo = "Keep Shopping";


		sendWhatsApp(whatsAppMsg, text, attachement, additionalInfo);
		sendSMS(whatsAppMsg, text);

	}



}
