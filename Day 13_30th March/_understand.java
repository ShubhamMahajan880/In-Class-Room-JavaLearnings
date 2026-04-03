public class PaymentInfo {

	public static void main(String[] args) {
		System.out.println("Dealing with Payment Info");
		
		LetsPay pay = new LetsPay();
		pay.LetsPay();
	}
	
	
	public void LetsPay() {
		System.out.println("Base Payment Need to do is - 10000");
		System.out.println("Min Fees is - 27000");
		
		afterPlacement paymentPart = new afterPayment();
		paymentPart.afterPlacement();
	}
	
	public void afterPlacement() {
		System.out.println("After Placement, need to pay - 30000");
		
		System.out.println("Congratulaitons...., done all formalities successfuly");
	}
}
