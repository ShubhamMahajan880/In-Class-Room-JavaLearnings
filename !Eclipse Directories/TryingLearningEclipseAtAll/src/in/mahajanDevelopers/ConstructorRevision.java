package in.mahajanDevelopers;

class PropertyDetails {
	String propertyPlace;
	String propetyName;
	int priceofProperty;
	long infutureReturn;

	public void finalizingProperty() {
		System.out.println("I am a default constructor a=nd no one is calling me - i myself only can call me");

	}

	public void finalizingProperty(String _propertyPlace, String _propertyName, int _priceofProperty,
			long _infutureReturn) {
		this.propertyPlace = _propertyPlace;
		this.propetyName = _propertyName;
		this.priceofProperty = _priceofProperty;
		this.infutureReturn = _infutureReturn;
	}
}

public class ConstructorRevision {

	public static void main(String[] args) {
		System.out.println("Doing practices for constructor and its understanding  -");

		System.out.println("I am about to creating a object");
		PropertyDetails p = new PropertyDetails();

		System.out.println("After object cretion I am caaling to default constrocor");
		p.finalizingProperty();
		System.out.println("Default Constructor called successfully");

		System.out.println("now calling to parameterized constructor");
		p.finalizingProperty("Pune", "Apartment", 11111, 1000000111);

		System.out.println("Printing details of my property class as - ");
		System.out.println("Place name of the property is- " + p.propertyPlace);
		System.out.println("Name name of the property is- " + p.propetyName);
		System.out.println("price of the property is- " + p.priceofProperty);
		System.out.println("Infuture  returns of the property is- " + p.infutureReturn);

	}

}
