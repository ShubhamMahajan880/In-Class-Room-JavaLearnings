
class InvoiceManagement // parent class
{

}

class GSTInvoice extends InvoiceManagement // child class extended from parent class
{

}

public class Casting {

	public static void main(String[] args) {
		GSTInvoice gstInvoice = new GSTInvoice(); // simple object creation
		// Type RefName = Actual Object
		// int amount = 100;

		// Parent class can refer child class object
		// InvoiceManagement invoiceManagement = new GSTInvoice() // auto up casting OR
		InvoiceManagement invoiceManagement = (InvoiceManagement) new GSTInvoice(); // manually doing upskilling - not
		// required

		// when child class want to refer parent class then there is no auto concept...
		// it must be down casting by mentioning the object

		GSTInvoice gstinvoice2 = (GSTInvoice) new InvoiceManagement(); // Down Casting

		//- But its not allowing but it'd be by syntax -
		InvoiceManagement iM = new GSTInvoice(); // parent ko jhuka kr child tk laaye
		GSTInvoice gstInvoice3 = (GSTInvoice) iM; // ab child k obj cretion me parent use kiya .. its Down Casting.
		System.out.println("Casting.main()");
	}

}
