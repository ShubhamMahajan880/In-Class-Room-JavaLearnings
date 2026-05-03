package com.Revision.D29.PaymentMethod;

public class PaymentMethod_AmazonPay extends PaymentSystem{
	@Override
	public void doPayment()
	{
		System.out.println("PaymentMethod_AmazonPay.doPayment() - Responsible only for Amazon Pay and app transactions stuff");
	}
}
