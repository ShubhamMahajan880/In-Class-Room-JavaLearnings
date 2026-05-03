package com.Revision.D29.PaymentMethod;

public class PlatformToAddingApplications {
	public static void main(String[] args) {

		MyPaymentProcessor mPP = new MyPaymentProcessor();

		PaymentMethod_UPI upI = new PaymentMethod_UPI();
		mPP.processingPayment(upI);// PaymentMethod1_UPI.doPayment() - responsible for UPI Payments

		PaymentMethod_PayTM ptM = new PaymentMethod_PayTM();
		mPP.processingPayment(ptM);// PaymentMethod_PayTM.doPayment() - responsible for All PayTM Payments


		// Adding a new method for =ayment whuch is -AMazonPay();

		PaymentMethod_AmazonPay amP = new PaymentMethod_AmazonPay();
		mPP.processingPayment(amP); // PaymentMethod_AmazonPay.doPayment() - Responsible only for Amazon Pay and app transactions stuff

		// Adding one more payment Method whch is - Samsung Pay();

		PaymentMethod_SamsungPay smP = new PaymentMethod_SamsungPay();
		mPP.processingPayment(smP); // PaymentMethod_SamsungPay.doPayment() - for all Samsung Payments only, on Paltforms as well as on Stores

	}

}
