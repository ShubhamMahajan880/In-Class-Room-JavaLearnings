package com.Revision.D25;

public class DetailstoCheck extends Confirmation {
	public void orderRequested(String message, int amount, String addressDetails, String extraInfo) {
		sendOnWhatsApp("Order Recieved Successfully", 450, "Devsheela PG for mens", "Thanks for purchasing");
	}



}
