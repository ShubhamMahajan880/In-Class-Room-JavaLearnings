package com.Revision;

public class ObjectCreationUnderstanding {

	public static void main(String[] args) {
		System.out.println("Calling classes in each other");

		System.out.println("Crating object of base class");
		ObjectCreationUnderstanding o = new ObjectCreationUnderstanding();

		System.out.println("basew class Object accessing to next method - paymentCulture");
		o.paymentCulture();
		System.out.println("paymentCulture accessed successfully");

		System.out.println("Accessing to another methods objetc");
		o.methodPayment();
		System.out.println("Another access also successfully");

	}

	public void paymentCulture() {
		System.out.println("Really oustanmding way to earn miney via doing these skills");
		ObjectCreationUnderstanding o2 = new ObjectCreationUnderstanding();
//		o2.paymentCulture();
//		System.out.println("Accreesed to within class itself");

		o2.methodPayment();
		System.out.println("Accesing to next method's class via this class");

	}

	public void methodPayment() {
		System.out.println("No need to worry ... using Paypal ... USD cna be taken in INR");

	}

}
