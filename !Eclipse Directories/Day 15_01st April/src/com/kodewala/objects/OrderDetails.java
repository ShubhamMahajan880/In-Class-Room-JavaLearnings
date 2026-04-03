package com.kodewala.objects;

class Delivery {
	String customerName;
	String ItemName;
	int DeliveryDate;

	// public Delivery() {
	// // TODO Auto-generated constructor stub // Default Constructor
	// }

	public Delivery (String _customerName, String _ItemName, int _DeliveryDate) {
		customerName = _customerName;
		ItemName = _ItemName;
		DeliveryDate = _DeliveryDate;

	}

}

public class OrderDetails {
	public static void main(String[] args) {
		System.out.println("Order Details are as following - ");

		Delivery  D0 = new Delivery ("Shubham", "TableLamp", 0104);
		System.out.println("First Ordr is - ");
		System.out.println("So, for D0 --> Cutomer is - " + D0.customerName);
		System.out.println("So, for D0 --> Order  is - " + D0.ItemName);
		System.out.println("So, for D0 --> DeliveryDateis - " + D0.ItemName);

		Delivery  D1 = new Delivery ("Suraj", "CoolinPad", 3103);
		System.out.println("Second Ordr is - ");
		System.out.println("So, for D1 --> Cutomer is - " + D1.customerName);
		System.out.println("So, for D1 --> Order  is - " + D1.ItemName);
		System.out.println("So, for D1 --> DeliveryDateis - " + D1.ItemName);

		Delivery D2 = new Delivery ("Nisarg", "RGB Lights", 2503);
		System.out.println("Third Ordr is - ");
		System.out.println("So, for D2 --> Cutomer is - " + D2.customerName);
		System.out.println("So, for D2 --> Order  is - " + D2.ItemName);
		System.out.println("So, for D2 --> DeliveryDateis - " + D2.ItemName);

	}

}
