package com.Revision.D25;

public class BillGeneration extends Confirmation{
	public void InvoiceDetails()
	{
		System.out.println("BillGeneration.InvoiceDetails()");
		sendOnWhatsApp("Bill generated", 4500, "Devsheela", "Take your invoice");
	}


}
