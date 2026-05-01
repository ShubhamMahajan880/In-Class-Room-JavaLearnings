package com.Revision.D18;

class ArrayUnderstanding {

	String paymentMethods[] = new String[5];

	public void creatingArray() {

		paymentMethods[0] = "WebDev";
		paymentMethods[1] = "AppDev";
		paymentMethods[2] = "AI";
		paymentMethods[3] = "GraphicDesigning";
		paymentMethods[4] = "ContentCreation";

		System.out.println("Printing array elements as - ");

		for (int index = 0; index < paymentMethods.length; index++) {
			System.out.println(index + " is " + paymentMethods[index]);
		}

		System.out.println("--------------->");
	}

	public void tryingArray() {

		for (int i = 0; i < paymentMethods.length; i++) {

			if (paymentMethods[i].startsWith("A")) {
				System.out.println(paymentMethods[i]);
			}
		}

		System.out.println("-------------->");
	}
}

public class ArrayCreation {

	public static void main(String[] args) {

		System.out.println("ArrayCreation.main()");

		ArrayUnderstanding aU = new ArrayUnderstanding();

		aU.creatingArray();
		aU.tryingArray();
	}
}